import java.util.*;  

class RequestDonation 
{
    private Entity entity;
    private double quantity;

    public RequestDonation (){ }
    
    public RequestDonation(Entity entity, double quantity){
     this.entity=entity;    
     this.quantity=quantity;
    }
    public boolean equals(Entity entity) {
        if (this.getEntity().getId() == entity.getId()){
            return true;
        }
     return false;
    }
    // GETTERS-SETTERS
    public Entity getEntity() {
        return entity;
    }
    public void setEntity(Entity entity) {
        this.entity=entity;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity=quantity;
    }
    public String getDetails()
    {return ("RequestDonation:Entity:"+entity+ " Quantity:"+quantity);}    
}
