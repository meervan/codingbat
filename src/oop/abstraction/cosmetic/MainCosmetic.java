package oop.abstraction.cosmetic;

import draft.Meervan1;

public class MainCosmetic {
    public static void main(String[] args) {
        Care gigi = new Care ("Care","Gigi", 5200, "halal");
        Decorative channel = new Decorative("decorative", "Chanel", 8000, "fruits");

        gigi.showComposition();
        gigi.isVegan();

        channel.showComposition();
        channel.isVegan();
        System.out.println(gigi.isVegan());
        System.out.println(channel.isVegan());

        VitaminE vitaminE = new VitaminE("E1");
        SPF sunCare = new SPF("Cream", "BB", 1200, "notHalal", "Vitaminchic", vitaminE);
        LipStick protectLips = new LipStick("Lip", "BB", 1200, "notHalal", "Vitaminchic", vitaminE);
        System.out.println(sunCare);
        System.out.println(protectLips);
        sunCare.getFresh();
        protectLips.getFresh();





    }
}
