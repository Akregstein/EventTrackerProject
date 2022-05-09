package com.skilldistillery.services;

import java.util.List;

import com.skilldistillery.entities.Mountain;



public interface MountainService {

	List<Mountain>index();
	
	Mountain findById(int mountId);
	
	Mountain create(Mountain mount);

	Mountain update(int mountId, Mountain mount);
	
	void deleteById(int mountId);
	
	List<Mountain> searchRangeByKeyword(String range);
	
	List<Mountain> searchByName(String name);
	
	List<Mountain> searchByRoundTripTime(int time1, int time2);
}
