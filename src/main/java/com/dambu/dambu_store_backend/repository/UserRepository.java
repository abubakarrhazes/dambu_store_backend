package com.dambu.dambu_store_backend.repository;

import com.dambu.dambu_store_backend.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    Page<User> findByNameContaining(String name , Pageable pageable);

    User save(User user);

    Optional<User> findById(Long id);

    void deleteById(Long id);








}
