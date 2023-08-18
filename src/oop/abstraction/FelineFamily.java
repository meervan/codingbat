package oop.abstraction;


    public class FelineFamily extends Animal{

        public String type;

        public FelineFamily(String name, int age, String type) {
            super(name, age);
            this.type = type;
        }

        @Override
        public void voice() {
            if (!(this.type.equalsIgnoreCase("cat"))){
                System.out.println("Aaaarrrr!");
            }
            else {
                System.out.println("Meo - Meo!");
            }
        }

        @Override
        public void run() {
            super.run();
        }

    }

