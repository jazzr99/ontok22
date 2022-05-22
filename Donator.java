public class Donator extends User{

    private Offers offersList;

    public Donator(String name, String phone) {
        super(name, phone);
    }

    public void setOffersList(Offers offersList){
    this.offersList = offersList;
    }
    
    public Offers getOffersList(){
    return this.offersList;
    }
    
    public Donator(){}
}
