package com.learning.repository;

import com.learning.model.Identity;

import java.sql.*;
import java.util.List;

import static com.learning.constants.Constants.SqlConstants.*;

/**
 * JDBC - chalta
 * Better
 * working jdbc doesnt matter
 * Brain storm generic how?
 */

public class GenericCrudRepositoryImpl<T extends Identity> implements GenericCrudRepository<T> {

    @Override
    public void create(T t, List<T> tList) {
        tList.add(t);
    }

    @Override
    public void display(int id, List<T> tList) {
        final String sql = "SELECT * FROM tab_user_det WHERE id =" + id + ";";
    }

    @Override
    public void displayAll(List<T> tList) {
        final String sql = "SELECT * FROM tab_user_det;";
        ResultSet resultSet = executeQuery(sql);
//        logic
    }

    @Override
    public void update(T t, List<T> tList) throws Exception {
        delete(t.getId(), tList);
        create(t, tList);
    }

    @Override
    public void delete(int id, List<T> tList) throws Exception {
        tList.remove(tList.stream().filter(i -> i.getId() == id).findFirst().orElseThrow(Exception::new));
    }

    @Override
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ResultSet executeQuery(String sql) {
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            statement.close();
            closeConnection(connection);
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
