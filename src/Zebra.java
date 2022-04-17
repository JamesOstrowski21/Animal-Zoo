/**
 * Zebra animal class that extends Animal.java
 *
 */
public class Zebra extends Animal{
    /**
     * Specific characteristics for a zebra
     */
    private String zebraStripes, zebraTail;

    /**
     * Constructor for the Zebra class, that takes all the same parameters as Animal.java and 2 more.
     * @param name animal name
     * @param DOB animal birthdate
     * @param Sound sound animal makes
     * @param Food food animal eats
     * @param Stripes color of stripes
     * @param Tail length of tail in inches
     */
    public Zebra(String name, String DOB, String Sound, String Food, String Stripes, String Tail) {
        super(name, DOB, "mammal", Sound, Food, "Zebra");
        setZebraStripes(Stripes);
        setZebraTail(Tail);
    }

    /**
     * get method for zebraStripes
     * @return zebraStripes
     */
    public String getZebraStripes(){
        return zebraStripes;
    }

    /**
     * get method for zebraTail
     * @return zebraTail
     */
    public String getZebraTail(){
        return zebraTail;
    }

    /**
     * set method for zebraStripes
     * @param st stripe color as a string
     */
    public void setZebraStripes(String st){
        zebraStripes = st;
    }

    /**
     * set method for zebraTail
     * @param t length of tail as a string
     */
    public void setZebraTail(String t){
        zebraTail = t;
    }
}
