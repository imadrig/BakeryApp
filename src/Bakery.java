import java.util.ArrayList;

public class Bakery {
    private String bakedGood;
    private double price;
    private String expDate;
    private ArrayList <String> dietRestriction;
    private int quantityInStock;

    public Bakery(){

    }

    public Bakery (String bakedGood, double price, String expDate, int quantityInStock, ArrayList <String> dietRestriction){
        this.bakedGood = bakedGood;
        this.price = price;
        this.expDate = expDate;
        this.quantityInStock = quantityInStock;
        this.dietRestriction = dietRestriction;
    }

    //Getter & setter baked good
    public String getBakedGood(){
        return this.bakedGood;
    }

    public void setBakedGood(String bakedGood){
        this.bakedGood = bakedGood;
    }

    //Getter & setter price
    public double getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    //Getter & setter expDate
    public String getExpDate(){
        return this.expDate;
    }
    public void setExpDate(String expDate){
        this.expDate = expDate;
    }

    //Getter & setter quantity in stock
    public int getQuantityInStock(){
        return this.quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    //Getter & setter dietRestriction
    public ArrayList<String> getDietRestriction(){
        return this.dietRestriction;
    }

    public void setDietRestriction(ArrayList<String> dietRestriction) {
        this.dietRestriction = dietRestriction;
    }

    //For printing out item descriptions
    public String itemDetails(){
        String msg = "";
        for (String item : dietRestriction){
            msg = msg + item;
        }
        return this.bakedGood + "\n" + this.price + "\n" + this.expDate + "\n" + this.quantityInStock + "\n" + dietRestriction;
    }
}
