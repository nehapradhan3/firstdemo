package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.example.GradleExampleApplication.DB;
//import com.example.GradleExampleApplication.DBCollection;
//import com.example.GradleExampleApplication.DBCursor;
//import com.example.GradleExampleApplication.MongoClient;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class GradleExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleExampleApplication.class, args);
		try {
	        MongoClient client = new MongoClient("localhost",27017);
	        DB database = client.getDB("FirstDB");
	        DBCollection collection = database.getCollection("players");
	        DBCursor myDoc = collection.find();
	        while (myDoc.hasNext()) {
	            System.out.println(myDoc.next());
	        }
	        }
	        catch(Exception e){
	            try {
	                throw e;
	            } catch (Exception e1) {
	                e1.printStackTrace();
	            }
	        }
	}
}
