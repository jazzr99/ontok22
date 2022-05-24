public abstract class User {
    private String name;
    private String phone;

    public User(){ }
    public User(String name, String phone){
     this.name=new String(name);
     this.phone=new String(phone);
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }}
