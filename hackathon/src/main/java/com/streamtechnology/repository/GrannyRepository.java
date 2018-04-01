package com.streamtechnology.repository;

import com.streamtechnology.entity.Granny;
import com.streamtechnology.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrannyRepository extends JpaRepository<Granny, Long> {

    List<Granny> findAllByUserRole(UserRole role);

    Granny findByEmail(String email);

}
