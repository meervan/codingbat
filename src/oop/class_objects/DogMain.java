package oop.class_objects;

public class DogMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.name = "Mouse";
        rex.name = "Charlie";
        System.out.println(rex.name);
        System.out.println(rex.age);
        System.out.println(rex.breed);
        System.out.println(rex.color);
        System.out.println(rex.eat());
        System.out.println(rex.bark());
        System.out.println(rex.sleep());
        System.out.println("------------------");

        Dog aktosh = new Dog();
        aktosh.name = "moinok";
        aktosh.age = 2;
        aktosh.breed = "Taygan";
        aktosh.color = "Black";
        System.out.println(aktosh.name);
        System.out.println(aktosh.age);
        System.out.println(aktosh.breed);
        System.out.println(aktosh.color);
        System.out.println(aktosh.eat());
        System.out.println(aktosh.bark());
        System.out.println(aktosh.sleep());

        System.out.println(myDog(rex));

    }

    public static  Dog myDog (Dog obj){
        return obj;

    }

}
