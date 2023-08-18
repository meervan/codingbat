package oop.abstraction;

public class AnimalMain {

        public static void main(String[] args) {

            FelineFamily puma = new FelineFamily("Tuma", 5, "puma");
            FelineFamily lion = new FelineFamily("Simba", 3, "lion");
            FelineFamily kate = new FelineFamily("Kate", 3, "CaT");
            kate.voice();
            String name = "meervan";
            String name2 =  new String ("meervan");
            String name3 =  new String ("meervan");
            System.out.println(name.hashCode());
            System.out.println(name2.hashCode());
            System.out.println(name3.hashCode());
            System.out.println(name==name2);
            System.out.println(name2==name3);
            String name4 = "meervan";
            System.out.println(name == name4);

        }
    }

