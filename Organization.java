import java.util.ArrayList;
import java.util.List;


public class Organization {
    
    private String name;
    private Admin admin;
    private List<Entity> entityList = new ArrayList<>();
    private List<Donator> donatorList = new ArrayList<>();
    private List<Beneficiary> beneficiaryList = new ArrayList<>();
    private RequestDonationList currentDonations;
    
    public Organization() {
        
    }
    
    public Organization(String name, Admin admin, RequestDonationList currentDonations) {
        this.name = name;
        this.admin = admin;
        this.currentDonations = currentDonations;        
    }

    //METHODS
    public void addEntity(Entity entity) {
        try {
            this.entityList.add(entity);
        }catch(ExistingException e) {
            System.out.println(e);
        }
    }

    public void removeEntity(Entity entity, boolean isAdmin) {
         if(isAdmin){
             this.entityList.remove(entity);}
    }    
     public void listEntities() {
        List<Material> materialsList = new ArrayList<>();
        List<Service> servicesList = new ArrayList<>();
        System.out.println("There are two possible catagories to choose from: Material or Services");
        
        for(Entity entity : this.entityList) {
            if(entity instanceof Material) {
                materialsList.add((Material) entity);
            }
            else {
                servicesList.add((Service) entity);
            }
        }
        
        for(Material material : materialsList) {
            material.getDetails();
        }
        
        for(Service service : servicesList) {
            service.getDetails();
        }
    }
    public void insertDonator(Donator donator) {
        try {
            this.donatorList.add(donator);
        }
        catch(ExistingException e) {
            System.out.println(e);
        }
    }
       
    
    public void removeDonator(Donator donator) {
        this.donatorList.remove(donator);
    }
    public void listDonators() {
        for(Donator donator : this.donatorList) {
            System.out.println(donator.getName() + donator.getPhone());
        }
    }
    public void insertBeneficiary(Beneficiary beneficiary) {
        try {
            this.beneficiaryList.add(beneficiary);
        }
        catch(ExistingException e) {
            System.out.println(e);
        }
    }
    
    public void removeBeneficiary(Beneficiary beneficiary) {
        this.beneficiaryList.remove(beneficiary);
    }
    

    
    public void listBeneficiaries() {
        for(Beneficiary beneficiary : this.beneficiaryList) {

            System.out.println(beneficiary.getReceivedList().monitor());

        }
    }
    
    
    
    //GET - SET ENCAPSULATION
    public Admin getAdmin() {
        return admin;
    }
    
    public void setAdmin (Admin admin) {
        this.admin=dmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    
    public List<Beneficiary> getBeneficiaryList() {
        return beneficiaryList;
    }

    public void setBeneficiaryList(List<Beneficiary> beneficiaryList) {
        this.beneficiaryList=beneficiaryList;
    }

    public List<Donator> getDonatorList() {
        return donatorList;
    }
    public List<Entity> getEntityList() {
        return entityList;
    }
 
   public void setEntityList(List<Entity> entityList) {
        this.entityList=entityList;
    }
  public RequestDonationList getCurrentDonations() {
        return currentDonations;
    }

    public void setCurrentDonations(RequestDonationList currentDonations) {
        this.currentDonations=currentDonations;
    }
}

    public void setDonatorList(List<Donator> donatorList) {
        this.donatorList=donatorList;
    }

  
