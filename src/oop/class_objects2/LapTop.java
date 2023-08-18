package oop.class_objects2;

public class LapTop {

    String mark ;
    String color;
    double price;


    public String code(){
        return "Hello World";
    }

    public String type(){
        return "Typing....";
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
