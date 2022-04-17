/**
 * Snake animal class that extends Animal.java
 *
 */
public class Snake extends Animal{
    /**
     * Specific characteristic of a snake
     */
    private String snakeColor;
    /**
     * Second specific characteristic of a snake
     */
    private String snakeBreed;

    /**
     * Constructor for the Snake class, that takes all the same parameters as Animal.java and 2 more.
     * @param name Animal name
     * @param DOB Animal birthdate
     * @param Sound Sound animal makes
     * @param Food Food animal eats
     * @param Color Color of snake
     * @param Breed Breed of snake
     */
    public Snake(String name, String DOB, String Sound, String Food, String Color, String Breed) {
        super(name, DOB, "reptile", Sound, Food, "Snake");
        setSnakeBreed(Breed);
        setSnakeColor(Color);
    }

    /**
     * get method for snakeColor
     * @return snakeColor
     */
    public String getSnakeColor(){
        return snakeColor;
    }
    /**
     * get method for snakeBreed
     * @return snakeBreed
     */
    public String getSnakeBreed(){
        return snakeBreed;
    }

    /**
     * set method for snakeColor
     * @param c color as a string
     */
    public void setSnakeColor(String c){
        snakeColor = c;
    }

    /**
     * set method for snakeBreed
     * @param b breed as a string
     */
    public void setSnakeBreed(String b){
        snakeBreed = b;
    }
}
