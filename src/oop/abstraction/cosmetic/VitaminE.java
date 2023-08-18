package oop.abstraction.cosmetic;

public class VitaminE {
    public String name;

    public VitaminE(String name) {
        this.name = name;
    }
    public void getYounger(){
        System.out.println("rejuvenation");
    }



    @Override
    public String toString() {
        return "VitaminE{" +
                "name='" + name + '\'' +
                '}';
    }
}

