package oop.abstraction.cosmetic;

public class SPF extends Care {
    public String name;
    public VitaminE vitaminchikE;

    public SPF(String type, String brand, int price, String recipe, String name, VitaminE vitaminchikE) {
        super(type, brand, price, recipe);
        this.name = name;
        this.vitaminchikE = vitaminchikE;
    }

    @Override
    public String toString() {
        return "SPF{" +
                "name='" + name + '\'' +
                ", vitaminE=" + vitaminchikE +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
    public void getFresh() { //
        vitaminchikE.getYounger(); //
    }
}
