package com.exampleRestaurantGeoSearch;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

@Component
public class RestaurantGeoSearchService {
	@Autowired
	private MongoOperations mongoOperations;
	
	public void createRestaurant(RestaurantRepresentation restaurant){
		Restaurant restaurantPersistence= new Restaurant();
		restaurantPersistence.setName(restaurant.getName());
		restaurantPersistence.setAddress(restaurant.getAddress());
		mongoOperations.save(restaurantPersistence);
		
	}
public List<Restaurant> findAll(){
	return null;
	
}
public List<Restaurant> findByDistance(){
	return null;
	
}
}
