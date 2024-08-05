package com.bigosoft.backend.usermanagement.adapter.out.repository;

import com.bigosoft.backend.usermanagement.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
