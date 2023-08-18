package oop.abstraction.cosmetic;

public class  Decorative extends Cosmetic {

    public Decorative(String type, String brand, int price, String recipe) {
        super(type, brand, price, recipe);
    }

    @Override
    public void showComposition() {
        System.out.println("состав данной косметики  " + brand + " = " + getRecipe());

    }

    @Override
    public boolean isVegan() {
        if (getRecipe().equals("halal")) {

            return true;
        }return  false;
    }
}
