package oop;

class Person{

    String name;
    String email;
    String phone;

    void walk(){
        System.out.println(name + " is waling");

    }
    void eat(){
        System.out.println(email);

    }
    void sleep(){
        System.out.println(name+ " is sleeping");

    }

}

public class Demo {
    public static void main(String[] args) {

        //Instantiating an object

        Person person1=new Person();

        //Define properties
        person1.name = "Dave";
        person1.email = "HSC.COach@gmail.com";
        person1.phone= "6145601076";

        Person person2 = new Person();
        person2.name = "Mary";
        person2.email = "mma@gmail.com";

        //Abstraction

        person1.walk();


        person2.sleep();



    }
}