import com.sun.javafx.scene.control.behavior.ScrollBarBehavior;

import java.util.ArrayList;

public class BakeryApp {
    public static void main(String[] args) {
        ArrayList<Bakery> bakedItems = new ArrayList<>();
        ArrayList<String> dietaryRestrictions = new ArrayList<>();
        dietaryRestrictions.add("gluten");
        dietaryRestrictions.add("nuts");

        //Trying to add banana bread to array list
        Bakery bananaBread = new Bakery("Banana Bread", 7.50, "12/21/21", 5, dietaryRestrictions);
        bakedItems.add(bananaBread);

        Bakery applePie = new Bakery("Apple Pie",5.54,"12/21/21",7, dietaryRestrictions);
        bakedItems.add(applePie);

        String name = "bread";
        double price=2.99;
        String exp = "06/30/2020";
        int qty = 10;

        Bakery good = new Bakery(name, price, exp, qty, dietaryRestrictions);
        bakedItems.add(good);

        name = "TEST";
        Bakery good2 = new Bakery(name, price, exp, qty, dietaryRestrictions);
        bakedItems.add(good2);

        for (Bakery list : bakedItems){
            System.out.println(list.itemDetails());
        }

    }
}
