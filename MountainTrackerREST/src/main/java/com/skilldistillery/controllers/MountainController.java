package com.skilldistillery.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.entities.Mountain;
import com.skilldistillery.services.MountainService;

@RequestMapping("api")
@RestController
public class MountainController {

	@Autowired
	MountainService serv;

	@GetMapping("index")
	public List<Mountain> index() {
		return serv.index();
	}

	@GetMapping("mountains/{mountId}")
	public Mountain getMountain(@PathVariable Integer mountId, HttpServletResponse res) {
		Mountain mount = serv.findById(mountId);
		if (mount == null) {
			res.setStatus(404);
		}
		return mount;
	}

	@GetMapping("mountains/search/{range}")
	public List<Mountain> searchByKeyword(@PathVariable String range) {
		return serv.searchRangeByKeyword(range);

	}

	@GetMapping("mountains/searchName/{name}")
	public List<Mountain> searchByName(@PathVariable String name) {
		return serv.searchByName(name);

	}

	@GetMapping("mountains/time/{time1}/{time2}")
	public List<Mountain> searchByRoundTripTimeHours(@PathVariable int time1, @PathVariable int time2) {
		return serv.searchByRoundTripTime(time1, time2);

	}

	@PostMapping("mountains/create")
	public Mountain createMountain(HttpServletResponse resp, @RequestBody Mountain mountain) {
		System.out.println("**********" + mountain + "***********");
		Mountain newMount = serv.create(mountain);
		if (newMount == null) {
			resp.setStatus(404);
		}
		if (newMount != null) {
			resp.setStatus(201);
		}
		return newMount;
	}

	@PutMapping("mountains/{mountId}")
	public Mountain updateMountain(@RequestBody Mountain mount, @PathVariable int mountId) {
		return serv.update(mountId, mount);
	}

	@DeleteMapping("mountains/{mountId}")
	public void deleteFilm(@PathVariable int id) {
		serv.deleteById(id);
	}
}