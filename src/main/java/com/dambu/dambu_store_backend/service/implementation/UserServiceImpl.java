package com.dambu.dambu_store_backend.service.implementation;

import com.dambu.dambu_store_backend.domain.User;
import com.dambu.dambu_store_backend.repository.UserRepository;
import com.dambu.dambu_store_backend.service.UserService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    final UserRepository userRepository;

    @Override
    public Page<User> getUsers(String name, int page, int size) {
        log.info("Fetching User from page {} of size {} ", page, size);
        return userRepository.findByNameContaining(name, PageRequest.of(page,size));
    }

    @Override
    //Create New User
    public User createUser(User user) {
        return userRepository.save(user);
    }





}
