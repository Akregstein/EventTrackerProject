package com.skilldistillery.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.entities.Mountain;
import com.skilldistillery.repositories.MountainRepository;

@Service
public class MountainServiceImpl implements MountainService {

	
	@Autowired
	MountainRepository repo;
	
	public List<Mountain>index(){
		return repo.findAll();
	}

	@Override
	public Mountain findById(int id) {
		Optional<Mountain> op = repo.findById(id);
		Mountain m = null;
		if (op.isPresent()) {
			m = op.get();
		}
		return m;
	}

	@Override
	public Mountain create(Mountain mount) {
		
		return repo.saveAndFlush(mount);
	
	}

	@Override
	public Mountain update(int mountId, Mountain mount) {
		mount.setId(mountId);
		if (repo.existsById(mountId)) {
			return repo.save(mount);
		}
		return null;
	}

	@Override
	public void deleteById(int mountId) {
		if (repo.existsById(mountId)) {
			repo.deleteById(mountId);
		}
		
	}

	@Override
	public List<Mountain> searchRangeByKeyword(String range) {
		range = "%" + range + "%";
		return repo.findByRangeLike(range);
	}
	@Override
	public List<Mountain> searchByName(String name) {
		name = "%" + name + "%";
		return repo.findByNameLike(name);
	}

	@Override
	public List<Mountain> searchByRoundTripTime(int time1, int time2 ) {
		
		return repo.findByEstimatedRoundTripTimeHoursBetween(time1, time2);
	}
	
	
}
