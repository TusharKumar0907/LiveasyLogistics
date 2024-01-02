package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Loads;


@Service
public class LoadServiceImpl implements LoadService {
	
	List<Loads> list;
	
	

	public LoadServiceImpl() {
		
		list = new ArrayList<>();
		
		list.add(new Loads("delhi", "jaipur", "chemicals", "canter", 1, 100, "No Comments", 1, "02-01-2024", 1));
		
		list.add(new Loads("delhi", "jaipur", "chemicals", "canter", 1, 100, "No Comments", 1, "02-01-2024", 2));
	}



	@Override
	public List<Loads> getLoads() {
		
		return list;
		
	}
	
	
	@Override
	public Loads getLoad(long loadId) {
		
		Loads l = null;
		
		for(Loads load: list) {
			if(load.getLoadId() == loadId) {
				l = load;
				break;
			}
		}
		
		return l;
		
	}
	
	

	
}
