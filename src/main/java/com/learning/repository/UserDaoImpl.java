package com.learning.repository;

import com.learning.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class UserDaoImpl implements GenericCrudRepository<User> {
    @Override
    public void create(User user, List<User> users) {

    }

    @Override
    public void display(int id, List<User> users) {

    }

    @Override
    public void displayAll(List<User> users) {

    }

    @Override
    public void update(User user, List<User> users) throws Exception {

    }

    @Override
    public void delete(int id, List<User> users) throws Exception {

    }

    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void closeConnection(Connection connection) {

    }

    @Override
    public ResultSet executeQuery(String sql) {
        return null;
    }
}
