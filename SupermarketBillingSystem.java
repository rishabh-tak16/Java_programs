import java.util.*;

class Item {
    String name;
    double price;
    int quantity;

    Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class SupermarketBillingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<Item>();
        double total = 0.0;

        // Adding items to the list
        items.add(new Item("Bread", 1.99, 2));
        items.add(new Item("Milk", 2.49, 1));
        items.add(new Item("Eggs", 0.99, 12));
        items.add(new Item("Butter", 3.49, 1));
        items.add(new Item("Cheese", 2.99, 2));

        // Printing the list of items
        System.out.println("Welcome to the Supermarket Billing System!");
        System.out.println("Here are the items in the supermarket:");
        System.out.println("----------------------------------------");
        System.out.println("Item\t\tPrice\tQuantity");
        for (Item item : items) {
            System.out.println(item.name + "\t\t$" + item.price + "\t" + item.quantity);
        }
        System.out.println("----------------------------------------");

        // Calculating the total cost of the items purchased
        System.out.println("Please enter the item name and quantity you want to purchase (enter 'done' to finish):");
        while (true) {
            String itemName = input.nextLine();
            if (itemName.equals("done")) {
                break;
            }
            int itemQuantity = input.nextInt();
            input.nextLine();
            for (Item item : items) {
                if (item.name.equalsIgnoreCase(itemName)) {
                    total += item.price * itemQuantity;
                    item.quantity -= itemQuantity;
                    break;
                }
            }
        }

        // Printing the receipt
        System.out.println("----------------------------------------");
        System.out.println("Receipt:");
        System.out.println("----------------------------------------");
        System.out.println("Item\t\tPrice\tQuantity\tTotal");
        for (Item item : items) {
            if (item.quantity < 0) {
                System.out.println(item.name + "\t\t$" + item.price + "\t" + (item.quantity + item.quantity) + "\t\t$" + (item.price * -item.quantity));
            } else {
                System.out.println(item.name + "\t\t$" + item.price + "\t" + item.quantity + "\t\t$" + (item.price * item.quantity));
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("Total:\t\t\t\t\t$" + total);
    }
}
