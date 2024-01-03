package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.Loads;


@Service
public class LoadServiceImpl implements LoadService {
	
//	@Autowired
//	private LoadDao loadDao;
	
	List<Loads> list;
	
	

	public LoadServiceImpl() {
		
		list = new ArrayList<>();
		
		list.add(new Loads("delhi", "jaipur", "chemicals", "canter", 1, 100, "No Comments", 1, "02-01-2024", 1));
		
		list.add(new Loads("delhi", "jaipur", "chemicals", "canter", 1, 100, "No Comments", 1, "02-01-2024", 2));
	}


//
	@Override
	public List<Loads> getLoads() {
		
		return list;
		
	}
//	
	
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
	
	
	@Override
	public List<Loads> getLoadByShipper(long shipperId) {
		
		list = list.stream().filter(e->e.getShipper()==shipperId).collect(Collectors.toList());
		
		return list;
		
	}
	
	
	@Override
	public Loads addLoad(Loads load) {
		
		list.add(load);
		return load;
		
	}
	
	@Override
	public Loads updateLoad(Loads load, long loadId) {
		
		
	    Loads b = list.stream().filter(e->e.getLoadId()==loadId).findFirst().get();
	    int index = list.indexOf(b);
	    b = load;
	    list.set(index, b);
		
		return getLoad(loadId);
		
	}
	
	
	@Override
	public Loads deleteLoad(long loadId) {
		
		Loads load = list.stream().filter(e -> e.getLoadId() == loadId).findFirst().get();
		list.remove(load);
		
		return load;
		
	}
	
	

	
}
