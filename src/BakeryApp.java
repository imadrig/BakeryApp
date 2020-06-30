import java.util.ArrayList;
import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, welcome to our bakery! Our products may contain soy, nuts, dairy and gluten. " +
                "\nTo find an item you can eat, please enter the diet restriction (gluten, nuts, soy, or dairy)");
        String restriction = sc.nextLine();


        ArrayList<Bakery> bakedItems = new ArrayList<>();
        ArrayList<String> dietaryRestrictions1 = new ArrayList<>();
        dietaryRestrictions1.add("gluten");

        ArrayList<String> dietaryRestrictions2 = new ArrayList<>();
        dietaryRestrictions2.add("nuts");
        dietaryRestrictions2.add("soy");

        ArrayList<String> dietaryRestrictions3 = new ArrayList<>();
        dietaryRestrictions3.add("dairy");

        ArrayList<String> dietaryRestrictions4 = new ArrayList<>();
        dietaryRestrictions4.add("dairy");
        dietaryRestrictions4.add("gluten");


        //Adding baked items to array
        Bakery multiGrainBread = new Bakery("Multi-grain Bread",9.50,"07/09/20",7, dietaryRestrictions1);
        bakedItems.add(multiGrainBread);

        Bakery bananaBread = new Bakery("Banana Bread", 7.50, "07/06/20", 5, dietaryRestrictions2);
        bakedItems.add(bananaBread);

        Bakery sixPackMuffins = new Bakery("Six-Pack Muffins", 12.99, "07/05/20", 3,dietaryRestrictions1);
        bakedItems.add(sixPackMuffins);

        Bakery dinnerRolls = new Bakery ("Gluten-Free Dinner Rolls", 8.50, "07/12/20", 9, dietaryRestrictions3);
        bakedItems.add(dinnerRolls);

        Bakery breadBox = new Bakery ("Best Bread Box", 12.99, "07/18/20", 7, dietaryRestrictions3);
        bakedItems.add(breadBox);

        Bakery cinnamonBread = new Bakery ("Cinnamon Bread", 9.99, "07/14/20", 3, dietaryRestrictions4);
        bakedItems.add(cinnamonBread);


        for (Bakery list : bakedItems){
            System.out.println(list.itemDetails());
        }

    }
}
