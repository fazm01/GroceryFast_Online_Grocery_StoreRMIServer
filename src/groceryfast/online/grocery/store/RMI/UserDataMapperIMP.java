/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import com.mongodb.client.model.Filters;
import static groceryfast.online.grocery.store.RMI.DB.gson;
import java.util.Optional;
import org.bson.Document;

/**
 *
 * @author Ahmed Desouki
 */
public class UserDataMapperIMP implements UserDataMapper {
         DB db=new DB();
    @Override
    public Optional<User> find(int userID) {
             return null;
    }

    @Override
    public void insertOne(User user) {
        db.collection2.insertOne(Document.parse(gson.toJson(user)));
        System.out.println("subscriber is inserted.");
    }

    @Override
    public void updateOne(User user) {
        
    }

    @Override
    
    //Delete fron subscribers 
    public void deleteOne(User user) {
        db.collection2.deleteOne(Filters.eq(user));
    }
    
}
