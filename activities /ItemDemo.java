//Basic UML Class with purchasing
//coded by Arn
//
import java.util.*;
import java.text.DecimalFormat;
class Item {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private double amountDue;
    public void setItemName(String newItemName) {
        itemName = newItemName;
    }
    public void setTotalCost(int quantity, double price) {
        itemQuantity = quantity;
        itemPrice = price;
    }
    public String getItemName() {
        return itemName;
    }
    public double getTotalCost() {
        double totalCost = itemQuantity * itemPrice;
        return totalCost;
    }
    public void readInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the item you purchasing.");
        setItemName(s.nextLine());
        System.out.println("Enter the quantity and price sperated by space.");
        setTotalCost(s.nextInt(), s.nextDouble());
    }
    public void writeOutput() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("You are purchasing " + itemQuantity + " " + getItemName() + "(s)" + " at " + itemPrice + " each.");
        System.out.println("Amount due is " + df.format(getTotalCost()));
    }
}
public class ItemDemo {
    public static void main(String[] args) {
        Item i = new Item();
        i.readInput();
        i.writeOutput();
    }
}
