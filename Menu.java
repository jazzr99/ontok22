import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;


public class Menu
{
 public static void main(String[] args)
  {
      Menu menu = new Menu();
      
      System.out.println("Welcome!/nDo you have an existing account? (yes/no)");
       
      Scanner scanner1 = new Scanner(System.in);
      String scanner_1 = scanner1.nextLine();
  
      if(scanner_1=="yes")
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
          menu.menuadmin();
        }
        else if(scan_number==2102210)
        {System.out.println("Hello Visenya");
          menu.beneficiary();
        } 
        else if(scan_number==22340221)
        {System.out.println("Hello Rhaenys");
          menu.beneficiary();
        }
        else if(scan_number==22810221)
        {System.out.println("Hello Maegor");
          menu.donator();
        } 
    }
 
 public void signing_up()
  {
            System.out.println("Would you like to become donator or beneficiary? (b/d)");
            
            Scanner scanChoice = new Scanner(System.in);
            String scan_choice = scanChoice.nextLine();
            
            if(scan_choice == "b")
            {
                Beneficiary newBeneficiary = new Beneficiary("NewBeneficiary","s",1);
                System.out.println("Name: " + newBeneficiary.getName());
                System.out.println("Phone: " + newBeneficiary.getPhone());
                System.out.println("NoPersons: " + newBeneficiary.getNoPersons());
            }             
            else if(scan_choice == "d")
            {
                Donator newDonator = new Donator("NewDonator","s");
                System.out.println("Name: " + newDonator.getName());
                System.out.println("Phone: " + newDonator.getPhone());
            }
   }
    
 
 public void menuadmin()
{
    System.out.println("Your Info:");
    Admin admin = new Admin("Aegon", "26102210");
    System.out.println("Name: " + admin.getName());
    System.out.println("Phone: " + admin.getPhone());
    System.out.println("IsAdmin: " + admin.getAdmin());
    System.out.println("Ηow do you want to continue?);
    System.out.println("[View(v)/Monitor Organization(mo)/Back(b)/Logout(l)/Exit(e)]");
    
    Scanner scanAdminChoice = new Scanner(System.in);
    String scanAdmin_choice = scanAdminChoice.nextLine();
    
    /*boolean exit;    xreiazete auto????? */
    switch(scanAdmin_choice)
    {
    case 1: System.out.println("You choce View.");
    System.out.println("Select a category:");
    System.out.println("1.Material /n2.Services");
    System.out.println("Press 1 for Materials or 2 for Services");
    
    Scanner category_number = new Scanner(System.in);
    Integer numberCategory = category_number.nextInt();
    
    if(numberCategory == 1)
     {
       System.out.println("These are the materials:");
       System.out.println("1.milk");
       System.out.println("2.sugar");
       System.out.println("3.rice");
       System.out.println("Press 1 for milk or 2 for sugar or 3 for rice");
     
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
       System.out.println("These are the materials:");
       System.out.println("1)MedicalSupport");
       System.out.println("2)NurserySupport");
       System.out.println("3)Babysitting");
     
     System.out.println("Press 1 for MedicalSupport or 2 for NurserySupport or 3 for Babysitting");
     
    Scanner number4 = new Scanner(System.in);
    Integer usernumber4 = number4.nextInt();
    int c = usernumber4;
    
    if(c == 1)
    {Service MedicalSupport = new Service("MedicalSupport","medical care",4);
     System.out.println("MedicalSupport");
     System.out.println("Description: " + MedicalSupport.getDescription());
     System.out.println("ID: " + MedicalSupport.getId());}
    else if(c == 2)
    {Service NurserySupport = new Service("NurserySupport","nursery care",5);
     System.out.println("NurserySupport");
     System.out.println("Description: " + NurserySupport.getDescription());
     System.out.println("ID: " + NurserySupport.getId());
    }
    else if(c == 3)
    {Service BabySitting = new Service("BabySitting","baby sitting",6);
     System.out.println("Babysitting");
     System.out.println("Description: " + BabySitting.getDescription());
     System.out.println("ID: " + BabySitting.getId());}
    } 
    break;
    
    
    case 2: System.out.println("Monitor Organization:");
    System.out.println("Options:");
    System.out.println("a.List Beneficiaries b.List Donators c.Reset Beneficiaries Lists");
    System.out.println("Press 1 to see the list of Beneficiaries");
    System.out.println("or press 2 to see the list of donators");
    System.out.println("or press 3 to reset beneficiaries' list.");
    
    Scanner number5 = new Scanner(System.in);
    Integer usernumber5 = number5.nextInt();
    int e = usernumber5;
     
    if(e == 1)
    {System.out.println("Beneficiaries: ");
    Beneficiary beneficiary1 = new Beneficiary("Tzilda", "0322230", 3);
    Beneficiary beneficiary2 = new Beneficiary("Aristea", "0239203", 2);
    Organization organization = new Organization();
    organization.listBeneficiaries();
    System.out.println("1.beneficiary1");
    System.out.println("2.beneficiary2");
    System.out.println("Press 1 for beneficiary1 or 2 for beneficiary2");
    
    Scanner number6 = new Scanner(System.in);
    Integer usernumber6 = number6.nextInt();
    int f = usernumber6;
    
    if(f == 1)
    {
    System.out.println("beneficiary1: ");
    System.out.println("Name: " + beneficiary1.getName());
    System.out.println("Phone: " + beneficiary1.getPhone() );
    System.out.println("Number of family members: " + beneficiary1.getNoPersons() );
    System.out.println(beneficiary1.getReceivedList());
    System.out.println("Do you want to delete the receivedList of beneficiary1?");
    System.out.println("Type 1 for yes or 2 for no");
    
    Scanner number7 = new Scanner(System.in);
    Integer usernumber7 = number7.nextInt();
    int g = usernumber7;
    
    if(g == 1)
    {
        RequestDonationList rdl = new RequestDonationList();
        rdl.reset();
        System.out.println("ReceivedList deleted");
    }
    else if (g == 2){System.out.println("You didn't delete the list");}
    System.out.println("Do you want to delete this beneficiary?");
    System.out.println("Type 1 for yes or 2 for no");
    
    Scanner number8 = new Scanner(System.in);
    Integer usernumber8 = number8.nextInt();
    int h = usernumber8;
    
    if(h == 1)
    {
        organization.removeBeneficiary(beneficiary1);
        System.out.println("Beneficiary deleted");
    }
    else if(h == 2){System.out.println("You didn't delete the beneficiary");}
    }
    if(f ==2){System.out.println("beneficiary2: ");
    System.out.println("Name: " + beneficiary2.getName());
    System.out.println("Phone: " + beneficiary2.getPhone() );
    System.out.println("Number of family members: " + beneficiary2.getNoPersons() );
    System.out.println(beneficiary2.getReceivedList());
    System.out.println("Do you want to delete the receivedList of beneficiary2?");
    System.out.println("Type 1 for yes or 2 for no");
    
    Scanner number9 = new Scanner(System.in);
    Integer usernumber9 = number9.nextInt();
    int i = usernumber9;
    
    if(i == 1)
    {
        RequestDonationList rdl = new RequestDonationList();
        rdl.reset();
        System.out.println("ReceivedList deleted");
    }
    else if (i == 2){System.out.println("You didn't delete the list");}
    System.out.println("Do you want to delete this beneficiary?");
    System.out.println("Type yes or no");
    
    Scanner number10 = new Scanner(System.in);
    Integer usernumber10 = number10.nextInt();
    int j = usernumber10;
    
    if(j == 1)
    {
        organization.removeBeneficiary(beneficiary2);
        System.out.println("Beneficiary deleted");
    }
    else if(j == 2){System.out.println("You didn't delete the beneficiary");}
    }
    }
    
    else if(e == 2)
    {
        Organization organization =  new Organization();
        organization.listDonators();
        System.out.println("Donators:");
        Donator donator = new Donator("Takis", "462456");
        System.out.println("donator");
        donator.getOffersList();
        System.out.println("Do you want to delete this donator?");
        System.out.println("Type 1 for yes or 2 for no");
        
        Scanner number11 = new Scanner(System.in);
        Integer usernumber11 = number11.nextInt();
        int k = usernumber11;
        
        if(k == 1)
        {
            organization.removeDonator(donator);
            System.out.println("You removed the donator");
        }
        else if(k == 2)
        {System.out.println("You didnt remove the donator");}
        
    }
    else if(e == 3)
    {
        System.out.println("CLEARING ALL RECEIVEDLIST FROM ALL BENEFICIARIES");
        Organization organization = new Organization();
        for(Beneficiary beneficiary:organization.getBeneficiaryList())
        {
            beneficiary.getReceivedList().reset();
        }
        System.out.println("CLEARED");
    }
    break;
    
    case 3: System.out.println("Back:");
    break;
    
    case 4: System.out.println("You are logged out.Do you want to sign up?");
    logout("phone");
    break;
    
    case 5: System.out.println("Exit:");
    exit = true;
    break;
    
    default: System.out.println("Error");
    }
}

public void logout(String s)
{
 if(s.equals("phone")){menuadmin();}
 else {System.out.println("");}
}

boolean exit2;
    int Choice;
    int Choice2;
    int Choice3;
    int Choice4;
    int Choice5;
    int Choice6;
    int Choice7;
    
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
    
    public void category(){
        System.out.println("------------------");
        System.out.println("WELCOME BENEFICIARY");
        System.out.println("Add Request ");
        System.out.println("choose one category:");
        System.out.println("1. Materials");
        System.out.println("2. Services");
        System.out.println("0. Exit");
        System.out.println("3.Log out");
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
