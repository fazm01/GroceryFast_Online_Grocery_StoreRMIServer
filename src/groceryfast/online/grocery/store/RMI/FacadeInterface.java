/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Ahmed Desouki
 */
public interface FacadeInterface extends Remote {
    
    public void SetUserData(String username, String email,String password )throws RemoteException;
    public String getUserData() throws RemoteException;
    public UserDTO getUser() throws RemoteException;
        
    
}
