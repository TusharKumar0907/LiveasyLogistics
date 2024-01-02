package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Loads;

public interface LoadService {
	
	public List<Loads> getLoads();
	
	public Loads getLoad(long loadId);
	
	public Loads addLoad(Loads load);
	
	public Loads updateLoad(Loads load, long loadId);
	
}
