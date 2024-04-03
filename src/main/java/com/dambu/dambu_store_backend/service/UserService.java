package com.dambu.dambu_store_backend.service;

import com.dambu.dambu_store_backend.domain.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> getUsers(String name, int page, int size);

    User createUser(User user);


}
