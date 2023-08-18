package oop.polymorphism;

    public class Animal {

        public String name;
        private int age;

        public Animal(){
        }

        public Animal(String name) {
            this.name = name;
        }

        public Animal(int age) {
            this.age = age;
        }

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Animal(int age, String name) {
            this.age = age;
            this.name = name;
        }



        public int getAge() {
            return age;
        }

        public String toPlay(String ball){
            return  name + "plays with this" + ball;
        }







    }

