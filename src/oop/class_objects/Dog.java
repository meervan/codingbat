package oop.class_objects;

public class Dog {

    public String name;
    public int age;
    public String color;
    public String breed;

    public String eat(){
        return "Yummy";
    }
    public String bark(){
        return "Gav-Gav";
    }
    public String sleep(){
        return "Zzzz....";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
