import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[]args){
        List<Entity> entityList = new ArrayList<>();

        Organization organization=new Organization();
    
        Material milk = new Material("Milk","Long life cow milk. (1.5L)", 1, 2.0, 4.0, 10.0);

        Material sugar = new Material("Sugar","White granulated sugar. (500g)", 2, 1.0, 4.0, 8.0);

        Material rice = new Material("Rice","Basmati rice. (250g)", 3, 2.0, 4.0, 8.0);
    
        Service MedicalSupport = new Service("MedicalSupport","Provided by experts in Famiy Medicine.",4);

        Service NurserySupport = new Service("NurserySupport","Provided by certified nursery care givers.",5);

        Service BabySitting = new Service("BabySitting","Provided by Primary Education students.",6);

        entityList.add(milk);

        entityList.add(sugar);

        entityList.add(rice);

        entityList.add(MedicalSupport);

        entityList.add(NurserySupport);

        entityList.add(BabySitting);

        Admin admin = new Admin("Aegon", "26102210");

        Beneficiary beneficiary01 = new Beneficiary("Visenya", "2102210",3);
 
        Beneficiary beneficiary02 = new Beneficiary("Rahaenys", "22340221",2);

        Donator donato01 = new Donator("Maegor", "22810221");
        
 
        Requests requestsBe01 = new Requests();
        
        /* Benefiaciary01 asks for rice */
 
        RequestDonation requestFromBeneficiary01_1 = new RequestDonation(rice,3);
 
        requestsBe01.add(requestFromBeneficiary01_1, entityList, beneficiary01);
        
        /* Benefiaciary01 asks for milk */
 
        RequestDonation requestFromBeneficiary01_2 = new RequestDonation(milk,1);
  
        requestsBe01.add(requestFromBeneficiary01_2, entityList, beneficiary01);
        
        /* Benefiaciary01 asks for Medical Support */
  
        RequestDonation requestFromBeneficiary01_3 = new RequestDonation(MedicalSupport,3);
  
        requestsBe01.add(requestFromBeneficiary01_3, entityList, beneficiary01);
        
    
        Offers offerDo01 = new Offers();
        
        /* Donator offers Nursery Support*/
    
        RequestDonation requestForfDonator01_1 = new RequestDonation(NurserySupport, 5);
    
        offerDo01.add(requestForfDonator01_1, entityList);
        
        /* Donator offers Medical Support*/
    
        RequestDonation requestForfDonator01_2 = new RequestDonation(MedicalSupport, 4);
    
        offerDo01.add(requestForfDonator01_2, entityList);
        
    }
}
