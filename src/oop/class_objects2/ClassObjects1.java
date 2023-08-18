package oop.class_objects2;

public class ClassObjects1 {





    public static void main(String[] args) {
        LapTop mac = new LapTop();
        mac.mark ="MacBook Pro";
        mac.color = "Silver";
        mac.price = 2200;
        System.out.println(mac.mark);
        System.out.println(mac.color);
        System.out.println(mac.price);
        System.out.println(mac.code());
        System.out.println(mac.type());
        System.out.println("---------------------");
        System.out.println(mac);

        LapTop samsung = new LapTop();
        samsung.mark = "Samsung";
        samsung.color = "White";
        samsung.price = 950;
        System.out.println(samsung.mark);
        System.out.println(samsung.color);
        System.out.println(samsung.price);
        System.out.println(samsung.code());
        System.out.println(samsung.type());
        System.out.println("---------------------");
        System.out.println(samsung);


        LapTop lenovo = new LapTop();
        lenovo.mark = "Lenovo";
        lenovo.color = "Red";
        lenovo.price = 850;
        System.out.println(lenovo.mark);
        System.out.println(lenovo.color);
        System.out.println(lenovo.price);
        System.out.println(lenovo.code());
        System.out.println(lenovo.type());
        System.out.println(lenovo);




    }





}
