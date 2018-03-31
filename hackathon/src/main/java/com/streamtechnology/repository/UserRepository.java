package com.streamtechnology.repository;

import com.streamtechnology.entity.Granny;
import com.streamtechnology.entity.User;
import com.streamtechnology.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    List<Granny> findAllByUserRoles(UserRole role);
}
