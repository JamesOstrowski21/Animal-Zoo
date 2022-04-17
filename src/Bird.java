/**
 * Bird animal class that extends Animal.java
 *
 */
public class Bird extends Animal{
    /**
     * Specific characteristic of a bird
     */
    private String birdType;
    /**
     * Second Specific characteristic of a bird
     */
    private String birdBeak;

    /**
     * Constructor for the Bird class, that takes all the same parameters as Animal.java and 2 more.
     * @param name Animal name
     * @param DOB Animal Birthdate
     * @param Sound Sound Animal makes
     * @param Food Food Animal eats
     * @param Type Type of Bird
     * @param Beak Color of Beak
     */
    public Bird(String name, String DOB, String Sound, String Food, String Type, String Beak) {
        super(name, DOB, "aves", Sound, Food, "Bird");
        setBirdBeak(Beak);
        setBirdType(Type);
    }

    /**
     * get method for birdType
     * @return birdType
     */
    public String getBirdType(){
        return birdType;
    }

    /**
     * get method for birdBeak
     * @return birdBeak
     */
    public String getBirdBeak(){
        return birdBeak;
    }

    /**
     * set birdType method
     * @param t type of bird as a string
     */
    public void setBirdType(String t){
        birdType = t;
    }

    /**
     * set birdBeak method
     * @param b takes beak color as a string
     */
    public void setBirdBeak(String b){
        birdBeak = b;
    }
}
