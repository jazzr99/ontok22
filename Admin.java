public class Admin extends User{  
    private boolean isAdmin = true;
    public Admin(){}
    public Admin(String name, String phone){
        super(name, phone);
    }
    public boolean getAdmin(){
        return isAdmin;
    }
    public void setAdmin(boolean admin){
        isAdmin=admin;
    }}
