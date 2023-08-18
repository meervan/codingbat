package oop.abstraction.cosmetic;

public class Care extends Cosmetic {


    public Care(String type, String brand, int price, String recipe) {
        super(type, brand, price, recipe);
    }

    @Override
    public void showComposition() {
        System.out.println("состав данного крема " + brand + " = " + getRecipe());

    }

    @Override
    public boolean isVegan() {
        if (getRecipe().equals("halal")) {
            return true;
        }return  false;

    }
}
