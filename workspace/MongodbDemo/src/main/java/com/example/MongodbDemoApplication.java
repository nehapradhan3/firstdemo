package com.example;
import com.mongodb.DB;
import com.mongodb.MongoClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class MongodbDemoApplication {

	public static void main(String[] args)  throws Exception{
		SpringApplication.run(MongodbDemoApplication.class, args);
try{
		MongoClient mongoClient=new MongoClient("localhost",27017);
DB db=mongoClient.getDB("test");
System.out.println("Connected to Database");
}catch(Exception e){
	System.out.println(e);
}
System.out.println("Server is ready");
	}
}
