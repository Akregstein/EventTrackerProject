package com.skilldistillery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.skilldistillery.entities.Mountain;

public interface MountainRepository extends JpaRepository <Mountain, Integer>{

	List<Mountain>findByRangeLike(@Param("Range")String range);
	
	List<Mountain>findByNameLike(@Param("Name")String name);
	
	List<Mountain>findByEstimatedRoundTripTimeHoursBetween(int time1, int time2);
	
}
