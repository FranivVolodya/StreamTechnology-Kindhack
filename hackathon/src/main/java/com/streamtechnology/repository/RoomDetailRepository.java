package com.streamtechnology.repository;

import com.streamtechnology.entity.RoomDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoomDetailRepository extends CrudRepository<RoomDetails,Integer> {

}
