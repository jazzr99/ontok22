import java.util.List;
import java.util.ArrayList;

public class Offers extends RequestDonationList {


    public void commit(RequestDonationList currentDonations, List<Entity> entityList){
        for(RequestDonation requestDonation: currentDonations.getRdEntities()){
            currentDonations.add(requestDonation, entityList);
        }

        currentDonations.getRdEntities().removeAll(currentDonations.getRdEntities());
    }
}
