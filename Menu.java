import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import javafx.scene.layout.Pane;


public class Menu
{ 
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
         //beneficiary();
        } 
        else if(scan_number==22340221)
        {System.out.println("Hello Rhaenys");
         //beneficiary();
        }
        else if(scan_number==22810221)
        {System.out.println("Hello Maegor");
         //donator();
        } 
    }
 
 public void signing_up()
  {
            System.out.println("Would you like to become donator or beneficiary? (1=beneficiary /2=donator)");
            
            Scanner scanChoice = new Scanner(System.in);
            Integer scan_choice = scanChoice.nextInt();

            if(scan_choice == 1)
            {
                Beneficiary newBeneficiary = new Beneficiary("NewBeneficiary","Number",1);
                System.out.println("Name: " + newBeneficiary.getName());
                System.out.println("Phone: " + newBeneficiary.getPhone());
                System.out.println("NoPersons: " + newBeneficiary.getNoPersons());
            }             
            else if(scan_choice == 2)
            {
                Donator newDonator = new Donator("NewDonator","Number");
                System.out.println("Name: " + newDonator.getName());
                System.out.println("Phone: " + newDonator.getPhone());
            }
   }
    
 
 public void admin_menu()
{
    System.out.println("Your Info:");
    Admin admin = new Admin("Aegon", "26102210");
    System.out.println("Name: " + admin.getName());
    System.out.println("Phone: " + admin.getPhone());
    System.out.println("IsAdmin: " + admin.getAdmin());
    System.out.println("Ηow do you want to continue?");
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
     System.out.println("Delete receivedList of beneficiary01?(y/n)");
    
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
    public void runMenu(){
        while(!exit){
            category();
            int Choice = getInput();
            performAction(Choice);
            
            if(Choice == 1){
                int Choice2 = getInput2();
                materialsList(Choice2);
            }
            
            else if(Choice == 2){
                int Choice3 = getInput3();
                servicesList(Choice3);
            }
            else if(Choice == 0){exit = true;}
            else if(Choice == 3){exit = true;}
                        
            requests();
            int Choice4 = getInput4();
            performAction2(Choice4);
            int Choice5 = getInput5();
            deleteRd2(Choice5);
            int Choice6 = getInput16();
            ModifyRd2(Choice6);
            int Choice7 = getInput17();
            resetall2(Choice7);
        }
    }
   
    public void beneficiary_menu(){
        System.out.println("Choose one option to continue:");
        System.out.println("1.Add Request");
        System.out.println("2.Show Requests");
        System.out.println("3.Commit");
        System.out.println("4.Back");
        System.out.println("5.Logout");
        System.out.println("6.Exit");
        System.out.println("Choose 1 or 2 or 3 or 4 or 5 or 6");
        
        Scanner benChoice = new Scanner(System.in);
        int ben_Choice  = benChoice.nextInt();
    
        switch(ben_Choice)
        {
            case 1 : System.out.println("1.Material or 2.Services");
            System.out.println("Choose 1 or 2.");
            
        Scanner categoryChoice = new Scanner(System.in);
        int category_Choice  = categoryChoice.nextInt();
        
        if (category_Choice == 1)
        {
            System.out.println("1.Milk");
            System.out.println("2.Sugar");
            System.out.println("3.Rice");
            System.out.println("Choose 1 or 2 or 3.");
            
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
                Requests requestofbeneficiary01 = new Requests();
                RequestDonation milkRequest = new RequestDonation(milk,1);
                requestofbeneficiary01.add(milkRequest,entityList);
                }
                else if(milk_Choose == 2)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests requestofbeneficiary01 = new Requests();
                RequestDonation milkRequest = new RequestDonation(milk,2);
                requestofbeneficiary01.add(milkRequest,entityList);
                }
                else if(milk_Choose == 3)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests requestofbeneficiary01 = new Requests();
                RequestDonation milkRequest = new RequestDonation(milk,3);
                requestofbeneficiary01.add(milkRequest,entityList);
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
                Requests requestofbeneficiary01 = new Requests();
                RequestDonation sugarRequest = new RequestDonation(sugar,1);
                requestofbeneficiary01.add(sugarRequest,entityList);
                }
                else if(sugar_Choose == 2)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests requestofbeneficiary01 = new Requests();
                RequestDonation sugarRequest = new RequestDonation(sugar,2);
                requestofbeneficiary01.add(sugarRequest,entityList);
                }
                else if(sugar_Choose == 3)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests requestofbeneficiary01 = new Requests();
                RequestDonation sugarRequest = new RequestDonation(sugar,3);
                requestofbeneficiary01.add(sugarRequest,entityList);
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
                Requests requestofbeneficiary01 = new Requests();
                RequestDonation riceRequest = new RequestDonation(rice,1);
                requestofbeneficiary01.add(riceRequest,entityList);
                }
                else if(rice_Choose == 2)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests requestofbeneficiary01 = new Requests();
                RequestDonation riceRequest = new RequestDonation(rice,2);
                requestofbeneficiary01.add(riceRequest,entityList);
                }
                else if(rice_Choose == 3)
                {
                List<Entity> entityList = new ArrayList<>(); 
                Requests requestofbeneficiary01 = new Requests();
                RequestDonation riceRequest = new RequestDonation(rice,3);
                requestofbeneficiary01.add(riceRequest,entityList);
                }    
            }
        }
        else if(category_Choice== 2)
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
                Requests requestofbeneficiary4 = new Requests();
                RequestDonation medicalSupportRequest = new RequestDonation(MedicalSupport,1);
                requestofbeneficiary4.add(medicalSupportRequest,entityList);}
            }
        }
        }
    
    
    private int getInput(){
        Scanner kb = new Scanner(System.in);
        int Choice = -1;
        while(Choice < 0 || Choice > 3 ){
            try{
                System.out.print("Enter your choice: ");    
                Choice = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return Choice;
    }
    
    private int getInput2(){
        Scanner kb = new Scanner(System.in);
        int Choice2 = -1;
        while(Choice2 < 0 || Choice2 > 3){
            try{
                System.out.print("Enter your choice: ");    
                Choice2 = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            } 
        }
        return Choice2;
    }   
    
    private int getInput3(){
        Scanner kb = new Scanner(System.in);
        int Choice3 = -1;
        while(Choice3 < 0 || Choice3 > 3){
            try{
                System.out.print("Enter your choice: ");    
                Choice3 = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            } 
        }
        return Choice3;
    }
        
    private void performAction(int Choice){
        switch(Choice){            
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
            System.out.println("choose one material:");
            System.out.println(" 1. Milk" + "\n 2. Sugar" + "\n 3. Rice");
                break;
            case 2:
                System.out.println("choose one service:");

                System.out.println(" 1. MedicalSupport" + "\n 2. NurserySupport" + "\n 3. BabySitting");
                break;
                case 3: exit = true; System.out.println("You are logged out.Do you want to sign up?");
                phone();
                break;
            default:
                System.out.println("An unknown error has occured");
        }
    }
    
    public void materialsList(int Choice2){        
        switch(Choice2){
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                Material milk = new Material("milk","dairy", 1, 1.0, 3.0, 6.0);
                System.out.println("Milk:");
                System.out.println(milk.getDetails());
                System.out.println("do you need milk?yes/no");
                Scanner scanner_6 = new Scanner(System.in);
                String Scanner_6 = scanner_6.nextLine();
                if(Scanner_6 == "yes"){
                List<Entity> entityList = new ArrayList<>();   
                RequestDonation requestDonation1 = new RequestDonation(milk,1);
                Requests requestofbeneficiary1 = new Requests();
                requestofbeneficiary1.add(requestDonation1,entityList);}

                else{return;}
                break;
            case 2:
                Material sugar = new Material("sugar","dried food", 2, 1.0, 3.0, 6.0);
                System.out.println("Sugar," + sugar.getDetails());
                System.out.println("do you need sugar?yes/no");
                Scanner scanner_7 = new Scanner(System.in);
                String Scanner_7 = scanner_7.nextLine();
                if(Scanner_7 == "yes"){
                List<Entity> entityList = new ArrayList<>();   
                RequestDonation requestDonation2 = new RequestDonation(sugar,1);
                Requests requestofbeneficiary2 = new Requests();
                requestofbeneficiary2.add(requestDonation2,entityList);}

                else{return;}
                break;
            case 3:
                Material rice = new Material("rice","dried food", 3, 1.0, 3.0, 6.0);
                System.out.println("Rice," + rice.getDetails());
                System.out.println("do you need rice?yes/no");
                Scanner scanner_8 = new Scanner(System.in);
                String Scanner_8 = scanner_8.nextLine();
                if(Scanner_8 == "yes"){
                List<Entity> entityList = new ArrayList<>();   
                RequestDonation requestDonation3 = new RequestDonation(rice,1);
                Requests requestofbeneficiary3 = new Requests();
                requestofbeneficiary3.add(requestDonation3,entityList);}

                else{return;}
                break;
                
            default:
                System.out.println("An unknown error has occured");
        }
    }    

    public void servicesList(int Choice3){        
        switch(Choice3){
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                Service MedicalSupport = new Service("MedicalSupport","medical care",4);
                System.out.println("MedicalSupport");
                System.out.println("do you need MedicalSupport?yes/no");
                Scanner scanner_9 = new Scanner(System.in);
                String Scanner_9 = scanner_9.nextLine();
                if(Scanner_9 == "yes"){
                List<Entity> entityList = new ArrayList<>();   
                RequestDonation requestDonation4 = new RequestDonation(MedicalSupport,1);
                Requests requestofbeneficiary4 = new Requests();
                requestofbeneficiary4.add(requestDonation4,entityList);}
                else{return;}
                break;
            case 2:
                Service NurserySupport = new Service("NurserySupport","nursery care",5);
                System.out.println("NurserySupport");
                System.out.println("do you need NurserySupport?yes/no");
                Scanner scanner_10= new Scanner(System.in);
                String Scanner_10 = scanner_10.nextLine();
                if(Scanner_10 == "yes"){
                List<Entity> entityList = new ArrayList<>();   
                RequestDonation requestDonation5 = new RequestDonation(NurserySupport,1);
                Requests requestofbeneficiary5 = new Requests();
                requestofbeneficiary5.add(requestDonation5,entityList);}
                else{return;}
                break;
            case 3:
                Service BabySitting = new Service("BabySitting","baby sitting",6);
                System.out.println("Babysitting");
                System.out.println("do you need Babysitting?yes/no");
                Scanner scanner_11 = new Scanner(System.in);
                String Scanner_11 = scanner_11.nextLine();
                if(Scanner_11 == "yes"){
                List<Entity> entityList = new ArrayList<>();   
                RequestDonation requestDonation6 = new RequestDonation(BabySitting,1);
                Requests requestofbeneficiary6= new Requests();
                requestofbeneficiary6.add(requestDonation6,entityList);}
                else{return;}
                break;
            default:
                System.out.println("An unknown error has occured");
        }}
            
   
              public void requests(){
    System.out.println(" Show requests: " + "\n 1. Milk" + "\n 2. Sugar" + "\n 3. Rice" + "\n 4. MedicalSupport" + "\n 5. NurserySupport" + "\n 6. Babysitting" );    
    }
    
    private void performAction2(int Choice4){
        switch(Choice4){
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                System.out.println("Milk");
                break;
            case 2:
                System.out.println("Sugar");
                break;
            case 3:
                System.out.println("Rice");
                break;
            case 4:
                System.out.println("MedicalSupport");
                break;
            case 5:
                System.out.println("NurserySupport");
                break;
            case 6:
                System.out.println("Babysitting");    
                break;
            default:
                System.out.println("An unknown error has occured");
        }                
    }
    
    private int getInput4(){
        Scanner kb = new Scanner(System.in);
        int Choice4 = -1;
        while(Choice4 < 0 || Choice4 > 6){
            try{
                System.out.print("Enter your choice: ");    
                Choice4 = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            } 
        }
        return Choice4;
    }
    
    public void removeRequests(){
        System.out.println("Would you like to remove all of your requests ? ");
    }
    
    public void deleteRd2(int Choice5){
        switch(Choice5){
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                System.out.println(" Would you like to delete this request?" + "\n Yes or No");
                Scanner scanner_12 = new Scanner(System.in);
                String Scanner_12 = scanner_12.nextLine();
                if(Scanner_12 == "yes"){
                    RequestDonation requestDonation = new RequestDonation();
                    RequestDonationList requestDonationList = new RequestDonationList();
                    requestDonationList.remove(requestDonation);
                }
                else{return;}
                break;
            default:
                System.out.println("An unknown error has occured");    
        }
    }
    
    private int getInput5(){
        Scanner kb = new Scanner(System.in);
        int Choice5 = -1;
        while(Choice5 < 0 || Choice5 > 1){
            try{
                System.out.print("Enter your choice: ");    
                Choice5 = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return Choice5;
    }
        
    public void commit(){        
        System.out.println("RequestDonation has been added succesfully!");
        RequestDonationList currentDonations = new RequestDonationList();
        Beneficiary beneficiary = new Beneficiary();
        List<Entity> entityList = new ArrayList<>();
        Requests requests = new Requests();
        requests.commit(entityList,beneficiary,currentDonations);
    }
    
    public void ModifyRd2(int Choice6)
    { 
        switch(Choice6){
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                System.out.println(" Would you like to modify this request?" + "\n Yes or No");
                Scanner scanner_16 = new Scanner(System.in);
                String Scanner_16 = scanner_16.nextLine();
                if(Scanner_16 == "yes"){
                    RequestDonation requestDonation = new RequestDonation();
                    RequestDonationList requestDonationList = new RequestDonationList();
                    requestDonationList.modify(requestDonation);
                }
                else{return;}
                break;
            default:
                System.out.println("An unknown error has occured");    
        }
    }
    
    private int getInput16()
    {
        Scanner kb = new Scanner(System.in);
        int Choice6 = -1;
        while(choice6 < 0 || choice6 > 1){
            try{
                System.out.print("Enter your choice(Modify(0) or don't modify(1)): ");    
                Choice6 = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return Choice6;
    }

    public void resetall2(int Choice7)
    {
    switch(Choice7){
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                System.out.println(" Would you like to delete all requests?" + "\n Yes or No");
                Scanner scanner_15 = new Scanner(System.in);
                String Scanner_15 = scanner_15.nextLine();
                if(Scanner_15 == "yes"){
                    RequestDonation requestDonation = new RequestDonation();
                    RequestDonationList requestDonationList = new RequestDonationList();
                    requestDonationList.remove(requestDonation);
                }
                else{return;}
                break;
            default:
                System.out.println("An unknown error has occured");    
        }
    
    }
    
    private int getInput17()
    {
        Scanner kb = new Scanner(System.in);
        int Choice7 = -1;
        while(Choice7 < 0 || Choice7 > 1){
            try{
                System.out.print("Enter your choice(Delete all or don't delete all): ");    
                choice7 = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return Choice7;
    }
    
    
    public void returnToBack(String string)
    {if(string.equals("category"))
    {runMenu();}   
    else{int Choice7 = getInput2(); materialsList(Choice7);
    }

}



    boolean exit;
    int choice;
    int choice2;
    int choice3;
    int choice4;
    int choice5;
    int choice6;
    int choice7;
    
    
    public void runMenu2(){
        while(!exit){
            category2();
            int choice = getInput();
            performAction(choice);
            
            if(choice == 1){
                int choice2 = getInput2();
                materialsList(choice2);
            }
            
            else if(choice == 2){
                int choice3 = getInput3();
                servicesList(choice3);
            }
            
            offers();
            int choice4 = getInput4();
            performAction4(choice4);
            
            removeOffers();
            int choice5 = getInput5();
            deleteRd2(choice5);
            
            int choice6 = getInput11();
            ModifyRd(choice6);
            int choice7 = getInput14();
            resetall(choice7);
        
            
            commit();
            
        }
    }
    
    public void returnToBack2(String string){
        if(string.equals("category")){
            runMenu();        
        }
        else{
        int choice7 = getInput2();
        materialsList(choice7);
        }
    }
    
    public void category2(){
        System.out.println("WELCOME DONATOR" + " to Donation System" );
        System.out.println("Add Offer ");
        System.out.println("choose one category:");
        System.out.println("1. Materials");
        System.out.println("2. Services");
        System.out.println("0. Exit");
    }
    
    private int getInput6(){
        Scanner kb = new Scanner(System.in);
        int choice = -1;
        while(choice < 0 || choice > 2){
            try{
                System.out.print("Enter your choice(Materials, Services or Exit): ");    
                choice = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return choice;
    }
    
    private int getInput7(){
        Scanner kb = new Scanner(System.in);
        int choice2 = -1;
        while(choice2 < 0 || choice2 > 3){
            try{
                System.out.print("Enter your choice(Milk, Sugar or Rice): ");    
                choice2 = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            } 
        }
        return choice2;
    }   
    
    private int getInput8(){
        Scanner kb = new Scanner(System.in);
        int choice3 = -1;
        while(choice3 < 0 || choice3 > 3){
            try{
                System.out.print("Enter your choice:(MedicalSupport, NurserySupport or Babysitting) ");    
                choice3 = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            } 
        }
        return choice3;
    }
        
    private void performAction3(int choice){
        switch(choice){            
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
            System.out.println("choose one material:");
            System.out.println(" 1. Milk" + "\n 2. Sugar" + "\n 3. Rice");
                break;
            case 2:
                System.out.println("choose one service:");

                System.out.println(" 1. MedicalSupport" + "\n 2. NurserySupport" + "\n 3. BabySitting");
                break;
            default:
                System.out.println("An unknown error has occured");
        }
    }
    
    public void materialsList2(int choice2){        
        switch(choice2){
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                Material milk = new Material("milk","dairy", 1, 1.0, 3.0, 6.0);
                System.out.println("Milk:");
                System.out.println(milk.getDetails());
                System.out.println("Would you like to donate milk?yes/no");
                Scanner scanner_6 = new Scanner(System.in);
                String Scanner_6 = scanner_6.nextLine();
                if(Scanner_6 == "yes"){
                    List<Entity> entityList = new ArrayList<>();   
                    RequestDonation requestDonation1 = new RequestDonation(milk,1);
                    Offers offerOfDonator1 = new Offers();
                    offerOfDonator1.add(requestDonation1,entityList);
                }
                else {
                    return;
                }
                
                break;
            case 2:
                Material sugar = new Material("sugar","dried food", 2, 1.0, 3.0, 6.0);
                System.out.println("Sugar," + sugar.getDetails());
                System.out.println("Would you like to donate sugar?yes/no");
                Scanner scanner_7 = new Scanner(System.in);
                String Scanner_7 = scanner_7.nextLine();
                if(Scanner_7 == "yes"){
                List<Entity> entityList = new ArrayList<>();   
                RequestDonation requestDonation2 = new RequestDonation(sugar,1);
                Offers offerOfDonator2 = new Offers();
                offerOfDonator2.add(requestDonation2,entityList);}

                else{return;}
                break;
            case 3:
                Material rice = new Material("rice","dried food", 3, 1.0, 3.0, 6.0);
                System.out.println("Rice," + rice.getDetails());
                System.out.println("do you need rice?yes/no");
                Scanner scanner_8 = new Scanner(System.in);
                String Scanner_8 = scanner_8.nextLine();
                if(Scanner_8 == "yes"){
                List<Entity> entityList = new ArrayList<>();   
                RequestDonation requestDonation3 = new RequestDonation(rice,1);
                Offers offerOfDonator3 = new Offers();
                offerOfDonator3.add(requestDonation3,entityList);}

                else{return;}
                break;            
            default:
                System.out.println("An unknown error has occured");
        }
    }    

    public void servicesList2(int choice3){        
        switch(choice3){
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                Service MedicalSupport = new Service("MedicalSupport","medical care",4);
                System.out.println("MedicalSupport");
                System.out.println("Would you like to provide MedicalSupport?yes/no");
                Scanner scanner_9 = new Scanner(System.in);
                String Scanner_9 = scanner_9.nextLine();
                if(Scanner_9 == "yes"){
                List<Entity> entityList = new ArrayList<>();   
                RequestDonation requestDonation4 = new RequestDonation(MedicalSupport,1);
                Offers offerOfDonator4 = new Offers();
                offerOfDonator4.add(requestDonation4,entityList);}
                else{return;}
                break;
            case 2:
                Service NurserySupport = new Service("NurserySupport","nursery care",5);
                System.out.println("NurserySupport");
                System.out.println("Would you like to provide NurserySupport?yes/no");
                Scanner scanner_10= new Scanner(System.in);
                String Scanner_10 = scanner_10.nextLine();
                if(Scanner_10 == "yes"){
                List<Entity> entityList = new ArrayList<>();   
                RequestDonation requestDonation5 = new RequestDonation(NurserySupport,1);
                Offers offerOfDonator5 = new Offers();
                offerOfDonator5.add(requestDonation5,entityList);}
                else{return;}
                break;
            case 3:
                Service BabySitting = new Service("BabySitting","baby sitting",6);
                System.out.println("Babysitting");
                System.out.println("Would you like to provide Babysitting?yes/no");
                Scanner scanner_11 = new Scanner(System.in);
                String Scanner_11 = scanner_11.nextLine();
                if(Scanner_11 == "yes"){
                List<Entity> entityList = new ArrayList<>();   
                RequestDonation requestDonation6 = new RequestDonation(BabySitting,1);
                Offers offerOfDonator6 = new Offers();
                offerOfDonator6.add(requestDonation6,entityList);}
                else{return;}
                break;
            default:
                System.out.println("An unknown error has occured");
        }
    } 
    
    public void offers(){
    System.out.println(" Show offers: " + "\n 1. Milk" + "\n 2. Sugar" + "\n 3. Rice" + "\n 4. MedicalSupport" + "\n 5. NurserySupport" + "\n 6. Babysitting" );    
    }
    
    private void performAction4(int choice4){
        switch(choice4){
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                System.out.println("Milk");
                break;
            case 2:
                System.out.println("Sugar");
                break;
            case 3:
                System.out.println("Rice");
                break;
            case 4:
                System.out.println("MedicalSupport");
                break;
            case 5:
                System.out.println("NurserySupport");
                break;
            case 6:
                System.out.println("Babysitting");    
                break;
            case 7:
                returnToBack("category");
            default:
                System.out.println("An unknown error has occured");
        }                
    }    
    
    public void ModifyRd(int choice6)
    { 
        switch(choice6){
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                System.out.println(" Would you like to modify this offer?" + "\n Yes or No");
                Scanner scanner_13 = new Scanner(System.in);
                String Scanner_13 = scanner_13.nextLine();
                if(Scanner_13 == "yes"){
                    RequestDonation requestDonation = new RequestDonation();
                    RequestDonationList requestDonationList = new RequestDonationList();
                    requestDonationList.modify(requestDonation);
                }
                else{return;}
                break;
            default:
                System.out.println("An unknown error has occured");    
        }
    
    
    }
    
    
    
    private int getInput9(){
        Scanner kb = new Scanner(System.in);
        int choice4 = -1;
        while(choice4 < 0 || choice4 > 7){
            try{
                System.out.print("Enter your choice:(1, 2, 3, 4, 5, 6, 7) ");    
                choice4 = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            } 
        }
        return choice4;
    }
    
    public void removeOffers(){
        System.out.println("Would you like to remove all of your offers ? ");
    }
    
    public void removeRd2(int choice5){
        switch(choice5){
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                System.out.println(" Would you like to delete this offer?" + "\n Yes or No");
                Scanner scanner_12 = new Scanner(System.in);
                String Scanner_12 = scanner_12.nextLine();
                if(Scanner_12 == "yes"){
                    RequestDonation requestDonation = new RequestDonation();
                    RequestDonationList requestDonationList = new RequestDonationList();
                    requestDonationList.remove(requestDonation);
                }
                else{return;}
                break;
            default:
                System.out.println("An unknown error has occured");    
        }
    }
    
    private int getInput10()
    {
        Scanner kb = new Scanner(System.in);
        int choice5 = -1;
        while(choice5 < 0 || choice5 > 1){
            try{
                System.out.print("Enter your choice(Remove(0) or don't remove(1)): ");    
                choice5 = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return choice5;
    }
    
    private int getInput11()
    {
        Scanner kb = new Scanner(System.in);
        int choice6 = -1;
        while(choice6 < 0 || choice6 > 1){
            try{
                System.out.print("Enter your choice(Modify(0) or don't modify(1)): ");    
                choice6 = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return choice6;
    }
    
    public void resetall(int choice7)
    {
    switch(choice7){
            case 0:
                exit = true;
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                System.out.println(" Would you like to delete all offers?" + "\n Yes or No");
                Scanner scanner_14 = new Scanner(System.in);
                String Scanner_14 = scanner_14.nextLine();
                if(Scanner_14 == "yes"){
                    RequestDonation requestDonation = new RequestDonation();
                    RequestDonationList requestDonationList = new RequestDonationList();
                    requestDonationList.remove(requestDonation);
                }
                else{return;}
                break;
            default:
                System.out.println("An unknown error has occured");    
        }
    
    }
    
    private int getInput14()
    {
        Scanner kb = new Scanner(System.in);
        int choice7 = -1;
        while(choice7 < 0 || choice7 > 1){
            try{
                System.out.print("Enter your choice(Delete all or don't delete all): ");    
                choice7 = Integer.parseInt(kb.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return choice7;
    }
    
        
    public void commit2(){        
        System.out.println("RequestDonation has been added succesfully!");
        RequestDonationList currentDonations = new RequestDonationList();
        List<Entity> entityList = new ArrayList<>();
        Offers offers = new Offers();
        offers.commit(currentDonations, entityList);
    }
}
