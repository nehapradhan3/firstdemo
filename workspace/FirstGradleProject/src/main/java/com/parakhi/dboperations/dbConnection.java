package com.parakhi.dboperations;
import 

public class dbConnection {
	public static void main(String[] args){
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
