/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

/**
 *
 * @author Ahmed Desouki
 */
public class Customer extends User{
     private String address;
     
      public Customer() {
            this.address = "";
        }

    public Customer(String username, String email, String password,String address) {
        super(username, email, password);
        this.address=address;
    }

   
      
      
     
}
