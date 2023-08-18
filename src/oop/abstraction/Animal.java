package oop.abstraction;

public class Animal {


        public String name;
        private int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    public void voice() {

    }

    public void run(){
            System.out.println("Run Run...");
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", family='" + age + '\'' +
                    '}';
        }
    }

// Class:
// 1. abstract class
// 2. non-abstract class

// Abstract class
// We cannot create object of abstract class
// We can create object of abstract class by child class of abstract class

// Abstract method,
// abstract method doesn't have a body
// We have to implement abstract method in child class
// abstract method should be created in abstract class

