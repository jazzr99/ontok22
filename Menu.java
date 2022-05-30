import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;


public class Menu
{ 
boolean exit;
 public static void main(String[] args)
  {
      Menu menu = new Menu();
      
      System.out.println("Welcome!\nDo you have an existing account? (1=yes / 2=no)");
      
        Scanner scanner1 = new Scanner(System.in);
        Integer scanner_1 = scanner1.nextInt();  

      if(scanner_1 == 1)
       {
       menu.phone();
       }
      else 
      {
       menu.signing_up();
      }
   }
 
 //Checking if User already exists.
 public void phone()
    {
        System.out.println("Please enter your phone number:");
        
        Scanner scannumber = new Scanner(System.in);
        Integer scan_number = scannumber.nextInt();
    
        if(scan_number==26102210)
        {System.out.println("Hello Aegon");
             admin_menu();
        }
        else if(scan_number==2102210)
        {System.out.println("Hello Visenya");
            beneficiary_menu();
        } 
        else if(scan_number==22340221)
        {System.out.println("Hello Rhaenys");
             beneficiary_menu();
        }
        else if(scan_number==22810221)
        {System.out.println("Hello Maegor");
             donator_menu();
        }
    }
 // Signing up form
 public void signing_up()
  {
            System.out.println("Would you like to become Beneficiary or Donator? (1=beneficiary /2=donator)");
            
            Scanner scanChoice = new Scanner(System.in);
            Integer scan_choice = scanChoice.nextInt();

            if(scan_choice == 1)
            {
                Beneficiary newBeneficiary = new Beneficiary("NewBeneficiary","Number",1);
                System.out.println("Name: " + newBeneficiary.getName());
                System.out.println("Phone: " + newBeneficiary.getPhone());
                System.out.println("NoPersons: " + newBeneficiary.getNoPersons());
                System.out.println("-----------------------------");
                
                beneficiary_menu();
            }             
            else if(scan_choice == 2)
            {
                Donator newDonator = new Donator("NewDonator","Number");
                System.out.println("Name: " + newDonator.getName());
                System.out.println("Phone: " + newDonator.getPhone());
                System.out.println("-----------------------------");
                
                donator_menu();
            }
   }
// Enter the Admin menu
 public void admin_menu()
{
    System.out.println("Your Info:");
    Admin admin = new Admin("Aegon", "26102210");
    System.out.println("Name: " + admin.getName() + "\nPhone: " + admin.getPhone() + "\nAdmin: " + admin.getAdmin() );
    System.out.println("[View(v)/Monitor Organization(mo)/Back(b)/Logout(l)/Exit(e)]");
    
    Scanner scanAdminChoice = new Scanner(System.in);
    String scanAdmin_choice = scanAdminChoice.nextLine();
    
    Boolean exit;
    switch(scanAdmin_choice)
    {
    case "v": System.out.println("You choce View.");
    System.out.println("Select a category:");
    System.out.println("1.Material");
    System.out.println("2.Services");
    System.out.println("Press 1 or 2.");
    
    Scanner category_number = new Scanner(System.in);
    Integer numberCategory = category_number.nextInt();
    
    if(numberCategory == 1)
     {
       System.out.println("These are the materials:");
       System.out.println("1.milk");
       System.out.println("2.sugar");
       System.out.println("3.rice");
       System.out.println("Press 1 or 2 or 3.");
     
       Scanner material_number = new Scanner(System.in);
       Integer materialNumber = material_number.nextInt();
    
       if(materialNumber == 1)
        {
           Material milk = new Material("Milk","Long life cow milk. (1.5L)", 1, 2.0, 4.0, 10.0);
           System.out.println("Milk");
           System.out.println("Description: " + milk.getDescription());
           System.out.println("ID: " + milk.getId());
           System.out.println(milk.getDetails());
        }
       else if(materialNumber == 2)
        {
          Material sugar = new Material("Sugar","White granulated sugar. (500g)", 2, 1.0, 4.0, 8.0);
          System.out.println("Sugar");
          System.out.println("Description: " + sugar.getDescription());
          System.out.println("ID: " + sugar.getId());
          System.out.println(sugar.getDetails());
        }
       else if(materialNumber == 3)
        {
          Material rice = new Material("Rice","Basmati rice. (250g)", 3, 2.0, 4.0, 8.0);
          System.out.println("Rice");
          System.out.println("Description: " + rice.getDescription());
          System.out.println("ID: " + rice.getId());
          System.out.println(rice.getDetails());
        }
     }
    else if(numberCategory == 2)
     {
       System.out.println("These are the Services:");
       System.out.println("1.MedicalSupport");
       System.out.println("2.NurserySupport");
       System.out.println("3.Babysitting");
       System.out.println("Press 1 or 2 or 3.");
     
       Scanner service_number = new Scanner(System.in);
       Integer serviceNumber = service_number.nextInt();
    
       if(serviceNumber == 1)
        {
          Service MedicalSupport = new Service("MedicalSupport","Provided by experts in Famiy Medicine.",4);
          System.out.println("MedicalSupport");
          System.out.println("Description: " + MedicalSupport.getDescription());
          System.out.println("ID: " + MedicalSupport.getId());
        }
       else if(serviceNumber == 2)
        {
          Service NurserySupport = new Service("NurserySupport","Provided by certified nursery care givers.",5);
          System.out.println("NurserySupport");
          System.out.println("Description: " + NurserySupport.getDescription());
          System.out.println("ID: " + NurserySupport.getId());
        }
       else if(serviceNumber == 3)
        {
          Service BabySitting = new Service("BabySitting","Provided by Primary Education students.",6);
          System.out.println("Babysitting");
          System.out.println("Description: " + BabySitting.getDescription());
          System.out.println("ID: " + BabySitting.getId());
        }
      } 
    break;
    
    case "mo": System.out.println("You choce Monitor Organization:");
    System.out.println("Press one of the following options:");
    System.out.println("1.List Beneficiaries");
    System.out.println("2.List Donators");
    System.out.println("3.Reset Beneficiaries Lists");
    System.out.println("Press 1 or 2 or 3.");
    
    Scanner scan_monitor = new Scanner(System.in);
    Integer scanMonitor = scan_monitor.nextInt();
     
    if(scanMonitor == 1)
    {
     System.out.println("Beneficiaries: ");
     Beneficiary beneficiary01 = new Beneficiary("Visenya", "2102210",3);
     Beneficiary beneficiary02 = new Beneficiary("Rhaenys", "22340221",2);
     Organization organization = new Organization();
     organization.listBeneficiaries();
     System.out.println("1.beneficiary01");
     System.out.println("2.beneficiary02");
     System.out.println("Press 1 or 2.");
    
    Scanner scan_beneficiary = new Scanner(System.in);
    Integer scanBeneficiary = scan_beneficiary.nextInt();
    
    if(scanBeneficiary == 1)
     {
       System.out.println("beneficiary01: ");
       System.out.println("Name: " + beneficiary01.getName());
       System.out.println("Phone: " + beneficiary01.getPhone() );
       System.out.println("Number of family members: " + beneficiary01.getNoPersons() );
       System.out.println(beneficiary01.getReceivedList());
       System.out.println("Delete receivedList of beneficiary01?(y/n)");
    
       Scanner scan_delete1 = new Scanner(System.in);
       String scanDelete1 = scan_delete1.nextLine();
    
    if(scanDelete1 == "y")
     {
       RequestDonationList requestDonationList = new RequestDonationList();
       requestDonationList.reset();
       System.out.println("ReceivedList deleted.");
     }
    else if (scanDelete1 == "n")
     {
      System.out.println("Τhe list was not deleted.");
     }
     
    System.out.println("---------------------------");
    System.out.println("Delete beneficiary01?(y/n)");
    
    Scanner scan_delete2 = new Scanner(System.in);
    String scanDelete2 = scan_delete2.nextLine();
    
    if(scanDelete2 == "y")
     {
        organization.removeBeneficiary(beneficiary01);
        System.out.println("Beneficiary01 deleted");
     }
    else if(scanDelete2 == "n")
     {
     System.out.println("Beneficiary01 was not deleted.");
     }
    }
     
    if(scanBeneficiary == 2)
    {
     System.out.println("beneficiary02: ");
     System.out.println("Name: " + beneficiary02.getName());
     System.out.println("Phone: " + beneficiary02.getPhone() );
     System.out.println("Number of family members: " + beneficiary02.getNoPersons() );
     System.out.println(beneficiary02.getReceivedList());
     System.out.println("Delete receivedList of beneficiary02?(y/n)");
    
     Scanner scan_delete3 = new Scanner(System.in);
     String scanDelete3 = scan_delete3.nextLine();
    
    if(scanDelete3 == "y")
     {
        RequestDonationList requestDonationList = new RequestDonationList();
        requestDonationList.reset();
        System.out.println("ReceivedList deleted");
     }
    else if (scanDelete3 == "n")
    {
      System.out.println("Τhe list was not deleted.");
    }
      
     System.out.println("---------------------------");
     System.out.println("Delete beneficiary01?(y/n)");
    
    Scanner scan_delete4 = new Scanner(System.in);
    String scanDelete4 = scan_delete4.nextLine();
    
    if(scanDelete4 == "y")
    {
        organization.removeBeneficiary(beneficiary02);
        System.out.println("Beneficiary02 deleted");
    }
    else if(scanDelete4 == "n")
     {
     System.out.println("Beneficiary02 was not deleted.");}
     }
 
    }
    else if(scanMonitor == 2)
    {
        System.out.println("Donators:");
        Donator donator01 = new Donator("Maegor", "22810221");
        Organization organization =  new Organization();
        organization.listDonators();
        System.out.println("donator");
     
        donator01.getOffersList();
     
        System.out.println("Delete donator?(y/n)");
        
        Scanner scan_delete5 = new Scanner(System.in);
        String scanDelete5 = scan_delete5.nextLine();
        
        if(scanDelete5 == "y")
        {
            organization.removeDonator(donator01);
            System.out.println("Donator deleted");
        }
        else if(scanDelete5 == "n")
        {
            System.out.println("Donator was not deleted.");
        }    
    }
    else if(scanMonitor == 3)
     {
        System.out.println("Reset Beneficiaries Lists");
        Organization organization = new Organization();
        for(Beneficiary beneficiary:organization.getBeneficiaryList())
        {
            beneficiary.getReceivedList().reset();
        }
        System.out.println("Τhe action is complete.");
    }
    break;
    
    case "b":
    System.out.println("Back:");
    phone();
    break;

    case "l": 
     System.out.println("Υou are disconnected.");
     System.out.println("Do you want to sign in?.");
     phone();
    break;
    
    case "e": System.out.println("Exit");
    exit = true;
    break;
    
 }
}
// Enter the Donator menu
    public void donator_menu()
    {
        System.out.println("Choose one option to continue:");
        System.out.println("1.Add Offers");
        System.out.println("2.Show Offers");
        System.out.println("3.Back");
        System.out.println("4.Logout");
        System.out.println("5.Exit");
        System.out.println("Choose 1 or 2 or 3 or 4 or 5");
              
        Scanner donChoice = new Scanner(System.in);
        int don_Choice  = donChoice.nextInt();
    
        switch(don_Choice)
        {
        case 1 : System.out.println("Choose 1 or 2.");
        System.out.println("1.Material or 2.Services");
            
        Scanner categoryChoice1 = new Scanner(System.in);
        int category_Choice1  = categoryChoice1.nextInt();
        
        if(category_Choice1 == 1)
        {
            Material milk = new Material("Milk","Long life cow milk. (1.5L)", 1, 2.0, 4.0, 10.0);
            Material sugar = new Material("Sugar","White granulated sugar. (500g)", 2, 1.0, 4.0, 8.0);
            Material rice = new Material("Rice","Basmati rice. (250g)", 3, 2.0, 4.0, 8.0);
                
            System.out.println("Choose 1 or 2 or 3.");
            System.out.println("1.Milk");
            System.out.println("2.Sugar");
            System.out.println("3.Rice");
            
            Scanner materialChoice = new Scanner(System.in);
            int material_Choice  = materialChoice.nextInt();
            
            if(material_Choice == 1)
            {  
                System.out.println("Milk:");
                System.out.println(milk.getDetails());
                
                System.out.println("Would you like to donate milk? (y/n)");
                Scanner scanner_1 = new Scanner(System.in);
                String Scanner_1 = scanner_1.nextLine();
                if(Scanner_1 == "y"){
                    List<Entity> entityList = new ArrayList<>();
                    RequestDonation requestDonation01 = new RequestDonation(milk,1);
                    Offers donatorOffers = new Offers();
                    donatorOffers.add(requestDonation01,entityList);
                }
                else {
                 break;   
                }
                    return;
            }
            else if(material_Choice == 2)
            {  
                System.out.println("Sugar:");
                System.out.println(sugar.getDetails());
                
                System.out.println("Would you like to donate Sugar? (y/n)");
                Scanner scanner_2 = new Scanner(System.in);
                String Scanner_2 = scanner_2.nextLine();
                if(Scanner_2 == "y"){
                    List<Entity> entityList = new ArrayList<>();
                    RequestDonation requestDonation02 = new RequestDonation(sugar,2);
                    Offers donatorOffers = new Offers();
                    donatorOffers.add(requestDonation02,entityList);
                }
                else {
                 phone();   
                }
                    return;
            }
            else if(material_Choice == 2)
            {  
                System.out.println("Rice:");
                System.out.println(rice.getDetails());
                
                System.out.println("Would you like to donate rice? (y/n)");
                Scanner scanner_3 = new Scanner(System.in);
                String Scanner_3 = scanner_3.nextLine();
                if(Scanner_3 == "y"){
                    List<Entity> entityList = new ArrayList<>();
                    RequestDonation requestDonation03 = new RequestDonation(rice,3);
                    Offers donatorOffers = new Offers();
                    donatorOffers.add(requestDonation03,entityList);
                }
                else {
                 phone();   
                }
                    return;
            }

        }
        else if(category_Choice1 == 2)
        {
            Service MedicalSupport = new Service("MedicalSupport","Provided by experts in Famiy Medicine.",4);
            Service NurserySupport = new Service("NurserySupport","Provided by certified nursery care givers.",5);
            Service BabySitting = new Service("BabySitting","Provided by Primary Education students.",6);
            
            System.out.println("1.MedicalSupprt");
            System.out.println("2.NurserySupport");
            System.out.println("3.BabySitting");
            System.out.println("Choose 1 or 2 or 3.");
            
            Scanner serviceChoice = new Scanner(System.in);
            int service_Choice  = serviceChoice.nextInt();
            
            if(service_Choice == 1)
            {
                System.out.println("MedicalSupprt:");
                System.out.println(MedicalSupport.getDetails());
                
                System.out.println("Would you like to donate MedicalSupport? (y/n)");
                Scanner scanner_4 = new Scanner(System.in);
                String Scanner_4 = scanner_4.nextLine();
                if(Scanner_4 == "y"){
                    List<Entity> entityList = new ArrayList<>();
                    RequestDonation requestDonation04 = new RequestDonation(MedicalSupport,4);
                    Offers donatorOffers = new Offers();
                    donatorOffers.add(requestDonation04,entityList);
                }
                else {
                 phone();   
                }
                    return;
            }
            else if(service_Choice == 2)
            {
                System.out.println("NurserySupport:");
                System.out.println(NurserySupport.getDetails());
                
                System.out.println("Would you like to donate NurserySupport? (y/n)");
                Scanner scanner_5 = new Scanner(System.in);
                String Scanner_5 = scanner_5.nextLine();
                if(Scanner_5 == "y"){
                    List<Entity> entityList = new ArrayList<>();
                    RequestDonation requestDonation05 = new RequestDonation(NurserySupport,5);
                    Offers donatorOffers = new Offers();
                    donatorOffers.add(requestDonation05,entityList);
                }
                else {
                 phone();   
                }
                    return;
            }
            else if(service_Choice == 3)
            {
                System.out.println("BabySitting:");
                System.out.println(BabySitting.getDetails());
                
                System.out.println("Would you like to donate BabySitting? (y/n)");
                Scanner scanner_6 = new Scanner(System.in);
                String Scanner_6 = scanner_6.nextLine();
                if(Scanner_6 == "y"){
                    List<Entity> entityList = new ArrayList<>();
                    RequestDonation requestDonation06 = new RequestDonation(BabySitting,6);
                    Offers donatorOffers = new Offers();
                    donatorOffers.add(requestDonation06,entityList);
                }
                else {
                 phone();   
                }
                    return; 
            }
            phone();
        }
           
        case 2 :Donator donator01 = new Donator("Maegor", "22810221");
        
        Organization organization =  new Organization();
        System.out.println("Donator's Offers:");
        System.out.println(organization.getCurrentDonations());
        
        break;
        
        case 3:
        System.out.println("Back:");
        phone();
        break;

        case 4: 
         System.out.println("Υou are disconnected.");
         System.out.println("Do you want to sign in?.");
         phone();
        break;
    
        case 5: System.out.println("Exit");
        exit = true;
        break; 
        }
        
    }
    // Enter the Beneficiary menu
      public void beneficiary_menu()
      {
        System.out.println("Choose one option to continue:");
        System.out.println("1.Add Request");
        System.out.println("2.Show Requests");
        System.out.println("3.Back");
        System.out.println("4.Logout");
        System.out.println("5.Exit");
        System.out.println("Choose 1 or 2 or 3 or 4 or 5");
        
        Scanner benChoice = new Scanner(System.in);
        int ben_Choice  = benChoice.nextInt();
    
        switch(ben_Choice)
        {
        case 1 : System.out.println("Choose 1 or 2.");
        System.out.println("1.Material or 2.Services");
            
        Scanner categoryChoice2 = new Scanner(System.in);
        int category_Choice2  = categoryChoice2.nextInt();
        
        if (category_Choice2 == 1)
        {
            System.out.println("Choose 1 or 2 or 3.");
            System.out.println("1.Milk");
            System.out.println("2.Sugar");
            System.out.println("3.Rice");
            
            Scanner materialChoice = new Scanner(System.in);
            int material_Choice  = materialChoice.nextInt();
            
            if(material_Choice == 1)
            {
                Material milk = new Material("Milk","Long life cow milk. (1.5L)", 1, 2.0, 4.0, 10.0);
                System.out.println("Milk:");
                System.out.println(milk.getDetails());
                System.out.println("Please enter quantity.");
                System.out.println("1. 2L or 2. 4L or 3. 10L");
                Scanner milkChoose = new Scanner(System.in);
                Integer milk_Choose = milkChoose.nextInt();
                if(milk_Choose == 1)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests request1ofbeneficiary = new Requests();
                RequestDonation milkRequest = new RequestDonation(milk,1);
                request1ofbeneficiary.add(milkRequest,entityList);
                commit();
                }
                else if(milk_Choose == 2)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests request2ofbeneficiary = new Requests();
                RequestDonation milkRequest = new RequestDonation(milk,2);
                request2ofbeneficiary.add(milkRequest,entityList);
                commit();
                }
                else if(milk_Choose == 3)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests request3ofbeneficiary = new Requests();
                RequestDonation milkRequest = new RequestDonation(milk,3);
                request3ofbeneficiary.add(milkRequest,entityList);
                commit();
                }    
            }
            else if(material_Choice == 2)
            {
                Material sugar = new Material("Sugar","White granulated sugar. (500g)", 2, 1.0, 4.0, 8.0);
                System.out.println("Sugar:");
                System.out.println(sugar.getDetails());
                System.out.println("Please enter quantity.");
                System.out.println("1. 1Kg or 2. 4KG or 3. 8Kg");
                Scanner sugarChoose = new Scanner(System.in);
                Integer sugar_Choose = sugarChoose.nextInt();
                if(sugar_Choose == 1)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests request4ofbeneficiary = new Requests();
                RequestDonation sugarRequest = new RequestDonation(sugar,1);
                request4ofbeneficiary.add(sugarRequest,entityList);
                commit();
                }
                else if(sugar_Choose == 2)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests request5ofbeneficiary = new Requests();
                RequestDonation sugarRequest = new RequestDonation(sugar,2);
                request5ofbeneficiary.add(sugarRequest,entityList);
                commit();
                }
                else if(sugar_Choose == 3)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests request6ofbeneficiary = new Requests();
                RequestDonation sugarRequest = new RequestDonation(sugar,3);
                request6ofbeneficiary.add(sugarRequest,entityList);
                commit();
                }    
            }
            else if(material_Choice == 3)
            {
                Material rice = new Material("Rice","Basmati rice. (250g)", 3, 2.0, 4.0, 8.0);
                System.out.println("Rice:");
                System.out.println(rice.getDetails());
                System.out.println("Please enter quantity.");
                System.out.println("1. 2Kg or 2. 4KG or 3. 8Kg");
                Scanner riceChoose = new Scanner(System.in);
                Integer rice_Choose = riceChoose.nextInt();
                if(rice_Choose == 1)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests request7ofbeneficiary = new Requests();
                RequestDonation riceRequest = new RequestDonation(rice,1);
                request7ofbeneficiary.add(riceRequest,entityList);
                commit();
                }
                else if(rice_Choose == 2)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests request8ofbeneficiary = new Requests();
                RequestDonation riceRequest = new RequestDonation(rice,2);
                request8ofbeneficiary.add(riceRequest,entityList);
                commit();
                }
                else if(rice_Choose == 3)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests request9ofbeneficiary = new Requests();
                RequestDonation riceRequest = new RequestDonation(rice,3);
                request9ofbeneficiary.add(riceRequest,entityList);
                commit();
                }    
            }
        }
        else if(category_Choice2 == 2)
        {
            System.out.println("1.MedicalSupprt");
            System.out.println("2.NurserySupport");
            System.out.println("3.BabySitting");
            System.out.println("Choose 1 or 2 or 3.");
            
            Scanner serviceChoice = new Scanner(System.in);
            int service_Choice  = serviceChoice.nextInt();
            
            if(service_Choice == 1)
            {
                Service MedicalSupport = new Service("MedicalSupport","Provided by experts in Famiy Medicine.",4);
                System.out.println("MedicalSupport");
                System.out.println(MedicalSupport.getDetails());
                List<Entity> entityList = new ArrayList<>();   
                Requests request10ofbeneficiary = new Requests();
                RequestDonation medicalSupportRequest = new RequestDonation(MedicalSupport,4);
                request10ofbeneficiary.add(medicalSupportRequest,entityList);
                commit();
            }
            else if(service_Choice == 2)
            {
                Service NurserySupport = new Service("NurserySupport","Provided by certified nursery care givers.",5);
                System.out.println("NurserySupport");
                System.out.println(NurserySupport.getDetails());
                List<Entity> entityList = new ArrayList<>();   
                Requests request11ofbeneficiary = new Requests();
                RequestDonation NurserySupportRequest = new RequestDonation(NurserySupport,5);
                request11ofbeneficiary.add(NurserySupportRequest,entityList);
                commit();
            }
            else if(service_Choice == 3)
            {
                Service BabySitting = new Service("BabySitting","Provided by Primary Education students.",6);
                System.out.println("BabySitting");
                System.out.println(BabySitting.getDetails());
                List<Entity> entityList = new ArrayList<>(); 
                commit();
                Requests request12ofbeneficiary = new Requests();
                RequestDonation BabySittingRequest = new RequestDonation(BabySitting,6);
                request12ofbeneficiary.add(BabySittingRequest,entityList);
            }
            }
            phone();
            
        case 2 : Beneficiary beneficiary01 = new Beneficiary("Visenya", "2102210",3);
 
        Beneficiary beneficiary02 = new Beneficiary("Rhaenys", "22340221",2);
        
        Organization organization =  new Organization();
        System.out.println("Beneficiary's 01 Requests:");
        System.out.println(organization.getCurrentDonations());
        
        System.out.println("Beneficiary's 02 Requests:");
        System.out.println(beneficiary02.getReceivedList()); 
        
        break;
        
        case 3:
        System.out.println("Back:");
        phone();
        
        break;

        case 4: 
         System.out.println("Υou are disconnected.");
         System.out.println("Do you want to sign in?.");
         phone();
         
        break;
    
        case 5: System.out.println("Exit");
        exit = true;
        
        break;   
        }
        }
        
    public void commit()
        {  
        System.out.println("Would you like to add this request of donation? (y/n)");
        Scanner commitScanner = new Scanner(System.in);
        String commit_scanner = commitScanner.nextLine();
        if (commit_scanner=="y")  
        {
        RequestDonationList currentDonations = new RequestDonationList();
        Beneficiary beneficiary = new Beneficiary();
        List<Entity> entityList = new ArrayList<>();
        Requests requests = new Requests();
        requests.commit(entityList,beneficiary,currentDonations);
        System.out.println("This request has been commited successfully!");
        }
        else if (commit_scanner=="n")
        {
        System.out.println("This request has not been commited.");
        phone();
        }
        }
    }
