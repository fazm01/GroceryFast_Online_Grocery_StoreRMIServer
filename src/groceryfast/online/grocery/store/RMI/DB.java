/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author Ahmed Desouki
 */
public class DB {
     public static MongoClient mongoClient;
    
   public static MongoDatabase database;
    
   MongoCollection<Document> collection1;
  
   public static Gson gson = new Gson();
    
   
   public DB() 
    {
        // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        mongoClient = new MongoClient("192.168.193.46",27017);
        // Database name
        database = mongoClient.getDatabase("GroceryFast"); 
        // Collection for the doctor 
        collection1 = database.getCollection("User"); 
  
   
    }
   
         public void insertUser(User u) 
    {
        collection1.insertOne(Document.parse(gson.toJson(u)));
        System.out.println("User is inserted.");
    }
         
         
         public void close() 
    {
        mongoClient.close();
    }
}
