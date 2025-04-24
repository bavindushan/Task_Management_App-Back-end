package edu.icet.service;

import edu.icet.dto.User;

import java.util.List;

public interface UserServices {
    void addUser(User user);

    void updateUser(User user);

    List<User> getAll();
}
