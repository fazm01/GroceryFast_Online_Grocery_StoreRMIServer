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
public class Voucher implements Subject {
    String voucherID;
    String expiry;
   UserDataMapperIMP DataMapper=new UserDataMapperIMP();
    public Voucher(String voucherID, String expiry) {
        this.voucherID = voucherID;
        this.expiry = expiry;
    }
    
    public Voucher() {
        
    }

    public String getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(String voucherID) {
        this.voucherID = voucherID;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    @Override
    public void addObserver(User user) {
        DataMapper.insertOne(user);
    }

    @Override
    public void removeObserver(User user) {
       DataMapper.deleteOne(user);
    }

    @Override
    public void notifyy() {
    }

    
    
    
    
}
