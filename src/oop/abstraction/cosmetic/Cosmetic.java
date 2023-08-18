package oop.abstraction.cosmetic;

public  abstract class Cosmetic {
    public String type;
    public String brand;
    public int price;
    private String recipe;

    public Cosmetic(String type, String brand, int price, String recipe) {
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "Cosmetic{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", recipe='" + recipe + '\'' +
                '}';
    }

    public abstract void showComposition();
    public abstract boolean isVegan();

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
