public abstract class Entity {
    private String name;
    private String description;
    private int id;
    public Entity() {
    }
    public Entity(String name, String description, int id){
        this.name=name;
        this.description=description;
        this.id=id;
    }
    // GETTERS-SETTERS
    public void setName(String Name){
    this.name=Name;
    }
    public String getName(){
    return name;
    }
    public void setDescription(String Description){
    this.description=Description;
    }

    public String getDescription(){
    return description;
    }
    public void setId(int Id){
    this.id=Id;
    }
    public int getId(){
    return id;
    }
    public String getEntityInfo(){
        return("The current donation is: " + this.name + " \n Description: " + this.description + " \n id: " + this.id + "." );
    }
    public abstract String getDetails();

    @Override
    public String toString() {
        return getEntityInfo() + getDetails();
    }}
