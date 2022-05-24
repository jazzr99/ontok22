public class Admin extends User{  
    private boolean Administrator = true;
    public Admin(){}
    public Admin(String name, String phone){
        super(name, phone);
    }
    public boolean getAdmin(){
        return Administrator;
    }
    public void setAdmin(boolean admin){
        Administrator = admin;
    }}
