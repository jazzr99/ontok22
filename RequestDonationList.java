import java.util.List;
import java.util.ArrayList;

public class RequestDonationList extends RequestDonation
{  
    private List<RequestDonation> rdEntities=new ArrayList<>();
    public RequestDonation get(int id)
    {    
       RequestDonation requestDonation=new RequestDonation();
       for (RequestDonation rd:rdEntities){
           if (rd.getEntity().getId()==id){
               requestDonation=rd;
           }}
        return requestDonation;
    }      
    public void add(RequestDonation requestDonation, List<Entity> entityList)
    {
        if(!entityList.contains(requestDonation.getEntity())) {
            throw new NonExistenceException("This entity does not exist in the organization!");
        }
        for (RequestDonation donation:rdEntities){
                if(requestDonation.equals(donation.getEntity())){
                    donation.setQuantity(donation.getQuantity() + requestDonation.getQuantity());
                }
                 else{
                    rdEntities.add(requestDonation);
                }}}
    public List<RequestDonation> getRdEntities(){
        return rdEntities;
    }
    public void setRdEntities(List<RequestDonation> rdEntities){
        this.rdEntities=rdEntities;
    }
    public void remove(RequestDonation requestDonation)
    {
        rdEntities.remove(requestDonation);
    }
    public double modify(RequestDonation requestDonation)
    {
        return requestDonation.getQuantity();
    }
    public String monitor()
    {
        for (int x=0; x<rdEntities.size(); x++)
    {
        return rdEntities.get(x).getDetails();
    }
        return "  ";
    }
    public void reset()
    {
        rdEntities.removeAll(rdEntities);
    }}
