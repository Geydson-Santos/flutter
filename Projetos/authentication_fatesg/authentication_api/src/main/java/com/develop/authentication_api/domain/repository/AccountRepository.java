package com.develop.authentication_api.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.develop.authentication_api.domain.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByUsernameAndPassword(String username, String password);

    Optional<Account> findByUsername(String username);
}
