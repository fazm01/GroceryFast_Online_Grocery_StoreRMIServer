/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import com.google.gson.Gson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.net.URLEncoder;

/**
 *
 * @author Ahmed Desouki
 */
public class DB {
   public static Gson gson = new Gson();
   
   public static MongoClient mongoClient;
    
   public static MongoDatabase database;
    
   MongoCollection<Document> collection1;
   MongoCollection<Document> collection2;
   
   public DB(){
    try{
             String uri = "mongodb+srv://GroceryFast:GroceryFast123@cluster0.abv1pkk.mongodb.net/test";
             MongoClient mongoClient = MongoClients.create(uri);
             
             MongoDatabase database = mongoClient.getDatabase("Cluster0");
             collection1 = database.getCollection("User");
             collection2 = database.getCollection("subscribers");
             
             System.out.println("connnected");
         } 
    catch(Exception e){
             System.err.println(e.getCause());
         }
   }
   
//   public void insertUser(User u) 
//    {
//        collection1.insertOne(Document.parse(gson.toJson(u)));
//        System.out.println("User is inserted.");
//    }
}