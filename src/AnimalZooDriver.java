import java.util.Scanner;

/**
 * AnimalZooDriver class that tests AnimalZoo.java and its methods.
 * Contains the main method.
 * @author James Ostrowski
 */
public class AnimalZooDriver {
    /**
     * Main method, test all methods of AnimalsZoo.java and Animal.java and its subclasses.
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 1;
        String input, type, name, dob, sound, food, specific1, specific2;
        AnimalZoo z = new AnimalZoo();
        Animal a1 = new Lion("George","2/26/2000","roars","antelope","500","male");
        Animal a2 = new Zebra("Charlie","2/4/1995","squeals","grass","brown","50");
        Animal a3 = new Bird("Clark","6/12/2005","chirps","seeds","robin","yellow");
        Animal a4 = new Snake("Sean","4/18/1980","hisses","mice","brown","python");
        z.addAnimal(a1);
        z.addAnimal(a2);
        z.addAnimal(a3);
        z.addAnimal(a4);

        while(x == 1) {
            System.out.println("What would you like to do 'add' animal, 'feed' animals, 'display' animals or 'exit'?");
            input = sc.nextLine();
            if(input.equals("add")){
                System.out.println("What type of animal would you like to add: lion, zebra, snake or bird?");
                type = sc.nextLine();
                System.out.println("What is the animal's name?");
                name = sc.nextLine();
                System.out.println("What is the animal's birthdate (mm/dd/yyyy)a");
                dob = sc.nextLine();
                System.out.println("What sound does the animal make?");
                sound = sc.nextLine();
                System.out.println("What does the animal eat?");
                food = sc.nextLine();
                if(type.equals("lion")){
                    System.out.println("How much does the lion weigh in lbs?");
                    specific1 = sc.nextLine();
                    System.out.println("What sex is the lion, male or female?");
                    specific2 = sc.nextLine();
                    Animal a = new Lion(name,dob,sound,food,specific1,specific2);
                    z.addAnimal(a);
                }else if(type.equals("zebra")){
                    System.out.println("What color are the zebra's stripes, brown or black?");
                    specific1 = sc.nextLine();
                    System.out.println("How long is the zebra's tail in inches?");
                    specific2 = sc.nextLine();
                    Animal a = new Zebra(name,dob,sound,food,specific1,specific2);
                    z.addAnimal(a);
                }else if(type.equals("bird")){
                    System.out.println("What type of bird is it?");
                    specific1 = sc.nextLine();
                    System.out.println("What color is the bird's beak");
                    specific2 = sc.nextLine();
                    Animal a = new Bird(name,dob,sound,food,specific1,specific2);
                    z.addAnimal(a);
                }else if(type.equals("snake")){
                    System.out.println("What color is the snake?");
                    specific1 = sc.nextLine();
                    System.out.println("What breed is the snake?");
                    specific2 = sc.nextLine();
                    Animal a = new Snake(name,dob,sound,food,specific1,specific2);
                    z.addAnimal(a);
                } else{
                    System.out.println("INVALID INPUT");
                }
            }else if(input.equals("feed")){
                z.feedAnimals();
            }else if(input.equals("display")){
                z.displayAnimals();
            }else if(input.equals("exit")){
                x = 0;
            }else {
                System.out.println("INVALID INPUT");
            }
        }
    }
}
