/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

/**
 *
 * @author Farid
 */
public class PlaceOrder extends OrderState{

    public PlaceOrder(Order order) {
        this.order = order;
    }
    
    
    @Override
    public void PlaceOrder(){
    order.setCurrentState(new PackagePrep(order));
    System.out.println("Order is being packaged & prepared");
    };
    
    
    @Override
    public void CancelOrder(){
    order.setCurrentState(null);
    System.out.println("Order has been cancelled");
    };
    
}
