/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Ahmed Desouki
 */
public class UserFacade extends UnicastRemoteObject implements FacadeInterface {
    
    User u;

    public UserFacade() throws RemoteException {
      u=new User("","","");
   }

  
    
    
    @Override
    public void SetUserData(String username, String email, String password) {
    u.setUsername(username);
    u.setEmail(email);
    u.setPassword(password);
    
    }
 @Override
    public String getUserData() throws RemoteException {
         String UserData =u.getUsername()+u.getEmail()+u.getPassword();
        return UserData;   
    }
 
    @Override
    public UserDTO getUser() throws RemoteException {
    UserDTO dto=new UserDTO(u.getUsername(),u.getEmail(),u.getPassword());
    return dto;
    }

   
    
    
}
