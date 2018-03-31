package com.streamtechnology.repository;

import com.streamtechnology.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
