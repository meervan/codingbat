package oop.abstraction.cosmetic;

public class LipStick  extends Decorative{

    public String name;
    public VitaminE vitaminE;

    public LipStick (String type, String brand, int price, String recipe, String name, VitaminE vitaminE) {
        super(type, brand, price, recipe);
        this.name = name;
        this.vitaminE = vitaminE;

    }

    @Override
    public String toString() {
        return "LipStick{" +
                "name='" + name + '\'' +
                ", vitaminE=" + vitaminE +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
    public void getFresh(){
        vitaminE.getYounger();


    }
}
