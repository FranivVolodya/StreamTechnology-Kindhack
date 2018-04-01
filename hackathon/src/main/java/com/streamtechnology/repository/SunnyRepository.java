package com.streamtechnology.repository;

import com.streamtechnology.entity.Sunny;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SunnyRepository extends JpaRepository<Sunny, Integer> {
}
