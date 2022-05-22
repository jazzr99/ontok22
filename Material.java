public class Material extends Entity{

    private int noPersons;
    private double level1,level2,level3;

    public Material(String name, String description, int id) {
        super(name, description, id);
    }
    
    public Material(String name, String description, int id, double level1, double level2, double level3){
    super(name, description, id);
    this.level1 = level1;
    this.level2 = level2;
    this.level3 = level3;
    }
    
    public String getDetails(){
            return(" The donation's level1 is: " + this.getLevel1() + "\n The donation's level2 is: " + this.getLevel2() + "\n The donation's level3 is: " + this.getLevel3() + " \n It's a material.");
        }

    public int getNoPersons () {
            return noPersons;
        }

    public double getLevel1 () {
            return level1;
        }

    public double getLevel2 () {
            return level2;
        }

    public double getLevel3 () {
            return level3;
        }
    }
