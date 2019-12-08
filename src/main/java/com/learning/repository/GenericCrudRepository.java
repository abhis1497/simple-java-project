package com.learning.repository;

import com.learning.model.Identity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public interface GenericCrudRepository<T extends Identity> {

    void create(T t, List<T> tList);

    void display(int id, List<T> tList);

    void displayAll(List<T> tList);

    void update(T t, List<T> tList) throws Exception;

    void delete(int id, List<T> tList) throws Exception;

    Connection getConnection();

    void closeConnection(Connection connection);

    ResultSet executeQuery(String sql);
}
