/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import java.util.Optional;

/**
 *
 * @author Ahmed Desouki
 */

public interface UserDataMapper {
     Optional<User> find(int userID);

        void insertOne(User user);

        void updateOne(User user) ;

        void deleteOne(User user);
}
