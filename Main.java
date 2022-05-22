import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[]args){
        List<Entity> entityList = new ArrayList<>();

        Organization organization=new Organization();
    
        Material milk = new Material("milk","dairy", 1, 1.0, 3.0, 6.0);

        Material sugar = new Material("sugar","dried food", 2, 1.0, 3.0, 6.0);

        Material rice = new Material("rice","dried food", 3, 1.0, 3.0, 6.0);
    
        Service MedicalSupport = new Service("MedicalSupport","medical care",4);

        Service NurserySupport = new Service("NurserySupport","nursery care",5);

        Service BabySitting = new Service("BabySitting","baby sitting",6);

        entityList.add(milk);

        entityList.add(sugar);

        entityList.add(rice);

        entityList.add(MedicalSupport);

        entityList.add(NurserySupport);

        entityList.add(BabySitting);

        Admin admin = new Admin("Ilias", "34634673");

        Beneficiary beneficiary1 = new Beneficiary("Tzilda", "0322230", 3);
 
        Beneficiary beneficiary2 = new Beneficiary("Aristea", "0239203", 2);

        Donator donator = new Donator("Takis", "462456");
 
        Requests requestsForBeneficiary1 = new Requests();
 
        RequestDonation requestDonationForBeneficiary1 = new RequestDonation(milk, 1);
 
        requestsForBeneficiary1.add(requestDonationForBeneficiary1, entityList, beneficiary1);
 
        RequestDonation requestDonation2ForBeneficiary1 = new RequestDonation(sugar, 2);
  
        requestsForBeneficiary1.add(requestDonation2ForBeneficiary1, entityList, beneficiary1);
  
        RequestDonation requestDonation3ForBeneficiary1 = new RequestDonation(MedicalSupport, 3);
  
        requestsForBeneficiary1.add(requestDonation3ForBeneficiary1, entityList, beneficiary1);
    
        Offers offerOfDonator = new Offers();
    
        RequestDonation requestDonationOfDonator = new RequestDonation(BabySitting, 4);
    
        offerOfDonator.add(requestDonationOfDonator, entityList);
    }
}
