import java.util.Scanner;

public class Person {
    protected boolean personType;
    protected int age;
    protected String lastName;
    protected String firstName;
    private String type;

    Scanner input = new Scanner(System.in);


    public Person(){
        this.firstName = "DefaultFirst";
        this.lastName = "DefaultLast";
        this.age = 0;
        this.personType = false;
    }

    public void userInput(){
        System.out.println("Enter your first name: ");
        firstName = input.next();
        System.out.println("Enter your last name: ");
        lastName = input.next();
        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("Enter true for Faculty or false for Student: ");
        personType = input.nextBoolean();

    }

    public void printInfo(){
        System.out.println("Welcome to SYSC2004 Lab 04 \nApparently you are a person!");
        System.out.println("Your name is: " + firstName + " " + lastName);
        if (personType == true){
            this.type = "Faculty";
        }
        else{
            type = "Student";
        }
        System.out.println("You are " + age + " years old \nYou are a " + type);
    }
}
