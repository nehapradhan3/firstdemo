package com.exampleRestaurantGeoSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/restaurants")
public class RestaurantResourse {
	@Autowired
	private RestaurantGeoSearchService service;
	@RequestMapping(method=RequestMethod.POST)
	public void create(RestaurantRepresentation RestaurantRep){
	service.createRestaurant(RestaurantRep);	
	}

}
