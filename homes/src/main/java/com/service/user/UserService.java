package com.service.user;

import com.entity.User;

import java.util.List;

public interface UserService {

    void add(User user);

    List<User> list();

    User get(String id);

    void update(User user);
}
