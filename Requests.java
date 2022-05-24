import java.util.Iterator;
import java.util.List;

public class Requests extends RequestDonationList {

    public void add(RequestDonation requestDonation, List<Entity> entityList, Beneficiary beneficiary) {
        try{
            if(!validRequestDonation(beneficiary,requestDonation)){
                throw new InvalidDonationException("No Donation For Beneficiary");
            }
            super.add(requestDonation, entityList);
        }
        catch(NoEntityFoundException nef)
        { nef.getMessage();
        }
    }
    public boolean validRequestDonation(Beneficiary beneficiary, RequestDonation requestDonation) {
        double level = 0;
        double totalQuantity = 0;
        if (requestDonation.getEntity() instanceof Material) {
            if(beneficiary.getNoPersons() == 1){
                level = ((Material) requestDonation.getEntity()).getLevel1();
            }
            else if(beneficiary.getNoPersons() >= 2 && beneficiary.getNoPersons() <=4){
                level = ((Material) requestDonation.getEntity()).getLevel2();
            }else if(beneficiary.getNoPersons() >=5){
                level = ((Material) requestDonation.getEntity()).getLevel3();
            }else{
                System.out.println("No acceptable number of persons");
            }
        }
        for(RequestDonation receivedMaterial : beneficiary.getReceivedList().getRdEntities()){
            if(((Material) requestDonation.getEntity()).equals((Material) receivedMaterial.getEntity())){
                totalQuantity += receivedMaterial.getQuantity();
            }
        }
        totalQuantity += requestDonation.getQuantity();

        if(totalQuantity > level){
            return false;
        }
        return true;
    }
    public void commit(List<Entity> entityList, Beneficiary beneficiary, RequestDonationList currentDonations){

        Iterator iterator = getRdEntities().iterator();
        while(iterator.hasNext()){
            RequestDonation requestDonationIterator = (RequestDonation) iterator.next();
            if(!entityList.contains(requestDonationIterator.getEntity())) {
                throw new NoEntityFoundException("There is no such entity in  organization's entityList");
            }
            if(!validRequestDonation(beneficiary,requestDonationIterator)){
                throw new NoValidDonationException("No Donation For Beneficiary");
            }
            getRdEntities().remove(requestDonationIterator);
            currentDonations.get(requestDonationIterator.getEntity().getId()).setQuantity(currentDonations.getQuantity() - requestDonationIterator.getQuantity());
            beneficiary.getReceivedList().getRdEntities().add(requestDonationIterator);
        } } }
