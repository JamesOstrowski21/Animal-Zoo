/**
 * Animal class, creates general information about an animal in a zoo.
 * Serves as a superclass for all specific animal types.
 */
public class Animal {
    /**
     * name of animal
     */
    private String animalName;
    /**
     * animal birthdate
     */
    private String animalDOB;
    /**
     * animal class
     */
    private String animalClass;
    /**
     * sound the animal makes
     */
    private String animalSound;
    /**
     * food the animal eats
     */
    private String animalFood;
    /**
     * type of specific animal out of the 4 options
     */
    private String animalType;
    /**
     * animal age
     */
    private int animalAge;

    /**
     * Base Constructor for any Animal
     * @param name animal name
     * @param DOB animal birthdate
     * @param Class animal class
     * @param Sound animal sound
     * @param Food animal food
     * @param Type animal type
     */
    public Animal(String name, String DOB, String Class, String Sound, String Food, String Type){
        setAnimalName(name);
        setAnimalDOB(DOB);
        setAnimalClass(Class);
        setAnimalSound(Sound);
        setAnimalFood(Food);
        setAnimalType(Type);
        setAnimalAge(DOB);
    }

    /**
     * get method for animalType
     * @return animalType
     */
    public String getAnimalType(){
        return animalType;
    }
    /**
     * get method for animalAge
     * @return animalAge
     */
    public int getAnimalAge(){
        return animalAge;
    }
    /**
     * get method for animalName
     * @return animalName
     */
    public String getAnimalName(){
        return animalName;
    }
    /**
     * get method for animalDOB
     * @return animalDOB
     */
    public String getAnimalDOB(){
        return animalDOB;
    }
    /**
     * get method for animalClass
     * @return animalClass
     */
    public String getAnimalClass(){
        return animalClass;
    }
    /**
     * get method for animalSound
     * @return animalSound
     */
    public String getAnimalSound(){
        return animalSound;
    }
    /**
     * get method for animalFood
     * @return animalFood
     */
    public String getAnimalFood(){
        return animalFood;
    }

    /**
     * set method for animalName
     * @param an animalName as a string
     */
    public void setAnimalName(String an){
        animalName = an;
    }

    /**
     * set method for animalDOB
     * @param ad DOB as a string
     */
    public void setAnimalDOB(String ad){
        animalDOB = ad;
    }

    /**
     * set method for animalClass
     * @param ac class as a string
     */
    public void setAnimalClass(String ac){
        animalClass = ac;
    }

    /**
     * set method for animalSound
     * @param s sound as a string
     */
    public void setAnimalSound(String s){
        animalSound = s;
    }

    /**
     * set method for animalFood
     * @param f food as a string
     */
    public void setAnimalFood(String f){
        animalFood = f;
    }

    /**
     * set method for animalType
     * @param t type as a string
     */
    public void setAnimalType(String t){
        animalType = t;
    }

    /**
     * set method for animalAge
     * @param d takes in a date as a string
     */
    public void setAnimalAge(String d){
        animalAge = 2022-Integer.parseInt(d.substring(d.length()-4,d.length()));
    }
}