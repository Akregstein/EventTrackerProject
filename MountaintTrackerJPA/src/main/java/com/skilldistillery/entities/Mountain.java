package com.skilldistillery.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mountain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

    private	String name;

	private String range;
	
	private int elevation;
	
	@Column(name= "most_popular_trail")
	private String mostPopularTrail;
	
	@Column(name= "estimated_round_trip_time_hours")
	private int estimatedRoundTripTimeHours;
	
	//methods
	public Mountain() {
		super();
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public int getElevation() {
		return elevation;
	}

	public void setElevation(int elevation) {
		this.elevation = elevation;
	}

	public String getMostPopularRoute() {
		return mostPopularTrail;
	}

	public void setMostPopularRoute(String mostPopularRoute) {
		this.mostPopularTrail = mostPopularRoute;
	}

	public int getEstimatedRoundTripTimeHours() {
		return estimatedRoundTripTimeHours;
	}

	public void setEstimatedRoundTripTimeHours(int estimatedRoundTripTimeHours) {
		this.estimatedRoundTripTimeHours = estimatedRoundTripTimeHours;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mountain [id=" + id + ", name=" + name + ", range=" + range + ", elevation=" + elevation
				+ ", mostPopularRoute=" + mostPopularTrail + ", estimatedRoundTripTimeHours="
				+ estimatedRoundTripTimeHours + "]";
	}
	
	
	
}
