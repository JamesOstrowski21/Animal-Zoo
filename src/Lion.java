/**
 * Lion animal class that extends Animal.java
 *
 */
public class Lion extends Animal{
    /**
     * Specific characteristics of a lion
     */
    private String lionWeight, lionSex;

    /**
     * Constructor for the Lion class, that takes all the same parameters as Animal.java and 2 more.
     * @param name animal name
     * @param DOB animal birthdate
     * @param Sound sounds animal makes
     * @param Food food animal eats
     * @param lw weight of the lion in lbs
     * @param lx sex of the lion
     */
    public Lion(String name, String DOB, String Sound, String Food, String lw, String lx) {
        super(name, DOB, "mammal",Sound,Food, "Lion");
        setLionSex(lx);
        setLionWeight(lw);
    }

    /**
     * get method for lionWeight
     * @return lionWeight
     */
    public String getLionWeight(){
        return lionWeight;
    }

    /**
     * get method for lionSex
     * @return lionSex
     */
    public String getLionSex(){
        return lionSex;
    }

    /**
     * set method for lionWeight
     * @param lw lion weight in lbs as a string
     */
    public void setLionWeight(String lw){
        lionWeight = lw;
    }

    /**
     * set method for lionSex
     * @param lx sex of lion as a string
     */
    public void setLionSex(String lx){
        lionSex = lx;
    }

}
