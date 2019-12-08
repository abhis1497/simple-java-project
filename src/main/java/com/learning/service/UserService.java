package com.learning.service;

import com.learning.model.User;

import java.util.List;

public interface UserService {

    void createUser(User user, List<User> userList);

    void display(int id, List<User> userList);

    void displayAll(List<User> userList);

    void updateUser(int id, List<User> userList);

    void deleteUser(int id, List<User> userList);

    void validateInput(User user, List<User> userList);
}
