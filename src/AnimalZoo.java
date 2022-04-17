import java.util.ArrayList;
import java.util.List;

/**
 * Zoo class that store all the animals of Animal.java or its subclasses
 */
public class AnimalZoo {
    /**
     * private list to store all the animals
     */
    private List<Animal> animals;

    /**
     * Zoo constructor to initialize list
     */
    public AnimalZoo(){
        //Initializes list when a new zoo is made
        animals = new ArrayList<Animal>();
    }

    /**
     * add method to add an animal to the zoo
     * @param a takes in an Animal to add
     */
    public void addAnimal(Animal a) {
        animals.add(a);
    }

    /**
     * foodAnimals method that outputs what each animal eats and what sounds it makes when it does
     */
    public void feedAnimals() {
        for (int x = 0; x < animals.size(); x++) {
            System.out.println(animals.get(x).getAnimalName() + " the "+animals.get(x).getAnimalType()+ " eats " + animals.get(x).getAnimalFood() + " and then "+animals.get(x).getAnimalSound());
        }
    }

    /**
     * method that outputs all the animals in the zoo
     * Outputs the animal's type, class, age, food, sound, and both specific characteristics of that animal type.
     */
    public void displayAnimals(){
        for(int x = 0; x <animals.size(); x++){
            System.out.print("Type: " + animals.get(x).getAnimalType()+ ", ");
            System.out.print("Class: "+animals.get(x).getAnimalClass()+ ", ");
            System.out.print("Age: " + animals.get(x).getAnimalAge()+ ", ");
            System.out.print("Food: "+ animals.get(x).getAnimalFood()+ ", ");
            System.out.print("Sound: " + animals.get(x).getAnimalSound()+ ", ");
            if(animals.get(x).getAnimalType() == "Lion"){
                System.out.print("Sex: "+((Lion)animals.get(x)).getLionSex()+ ", ");
                System.out.println("Weight: "+((Lion)animals.get(x)).getLionWeight()+" lbs");
            }else if(animals.get(x).getAnimalType() == "Snake"){
                System.out.print("Color: "+((Snake)animals.get(x)).getSnakeColor()+ ", ");
                System.out.println("Breed: "+((Snake)animals.get(x)).getSnakeBreed());
            }else if(animals.get(x).getAnimalType() == "Bird"){
                System.out.print("Type of Bird: "+((Bird)animals.get(x)).getBirdType()+ ", ");
                System.out.println("Beak: "+((Bird)animals.get(x)).getBirdBeak());
            }else if(animals.get(x).getAnimalType()== "Zebra"){
                System.out.print("Stripes: "+((Zebra)animals.get(x)).getZebraStripes()+ ", ");
                System.out.println("Tail: "+((Zebra)animals.get(x)).getZebraTail()+ "inches");
            }

        }
    }
}