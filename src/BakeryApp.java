import java.util.ArrayList;
import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        System.out.println("Hello, welcome to our bakery! Our products may contain soy, nuts, dairy and gluten. " +
                "\nTo find an item you can eat, please enter the diet restriction (gluten, nuts, soy, or dairy)" +
                "\nFor a list of all our items type and enter \"All\"");
        String restriction = sc.nextLine();


        //Adding baked items to array
        Bakery multiGrainBread = new Bakery("Multi-grain Bread",9.99,"07/09/20",7, dietaryRestrictions1);
        bakedItems.add(multiGrainBread);

        Bakery bananaBread = new Bakery("Banana Bread", 7.99, "07/06/20", 5, dietaryRestrictions2);
        bakedItems.add(bananaBread);

        Bakery sixPackMuffins = new Bakery("Six-Pack Muffins", 12.99, "07/05/20", 3,dietaryRestrictions1);
        bakedItems.add(sixPackMuffins);

        Bakery dinnerRolls = new Bakery ("Gluten-Free Dinner Rolls", 8.99, "07/12/20", 9, dietaryRestrictions3);
        bakedItems.add(dinnerRolls);

        Bakery breadBox = new Bakery ("Best Bread Box", 14.99, "07/18/20", 7, dietaryRestrictions3);
        bakedItems.add(breadBox);

        Bakery cinnamonBread = new Bakery ("Cinnamon Bread", 9.99, "07/14/20", 3, dietaryRestrictions4);
        bakedItems.add(cinnamonBread);

        Bakery softPizzaCrust = new Bakery("Soft Pizza Crust", 5.99, "07/18/20", 12, dietaryRestrictions1);
        bakedItems.add(softPizzaCrust);

        Bakery savoryRolls = new Bakery ("Savory Rolls", 11.99, "07/04/20", 12, dietaryRestrictions3);
        bakedItems.add(savoryRolls);

        Bakery largeHamburgerBuns = new Bakery ("Large Hamburger Buns", 5.99, "07/03/20", 22, dietaryRestrictions1);
        bakedItems.add(largeHamburgerBuns);

        Bakery springHappySet = new Bakery("Spring Happy Set", 14.99, "07/05/20", 4, dietaryRestrictions2);
        bakedItems.add(springHappySet);

        Bakery cinnamonRaisinBread = new Bakery("Cinnamon Raisin Bread", 9.99, "07/07/20", 8, dietaryRestrictions4);
        bakedItems.add(cinnamonRaisinBread);

        Bakery savoryEmpanadas = new Bakery("Dozen Savory Empanadas", 19.99, "07/14/20", 9,dietaryRestrictions2);
        bakedItems.add(savoryEmpanadas);

        Bakery breadPudding = new Bakery("Bread Pudding", 7.99, "07/02/20", 10, dietaryRestrictions2);
        bakedItems.add(breadPudding);

        Bakery gingerbreadCookie = new Bakery("Gingerbread Cookie", 3.99, "07/02/20", 24, dietaryRestrictions2);
        bakedItems.add(gingerbreadCookie);

        Bakery chocolateChipCookie = new Bakery("Chocolate Chip Cookie", 3.99, "07/02/20", 10, dietaryRestrictions3);
        bakedItems.add(chocolateChipCookie);


        if (restriction.equalsIgnoreCase("all"))
            for (Bakery list : bakedItems) {
                System.out.println("\n" + list.itemDetails());
                System.out.println("---------");
            }
        else {
            if(restriction.equalsIgnoreCase("gluten"))
        }



    }
}
