package duke.choice;

public class ShopApp {
  public static void main(String[] args) {
    System.out.println("Welcome to Duke Choice Shop!");
    
    Customer c1 = new Customer("Pinky", 3);
    System.out.println("Customer is " + c1.getName() + ", size: " + c1.getSize() + "!");

    System.out.println("Min Price: " + Clothing.MIN_PRICE);

    Clothing item1 = new Clothing("Blue Jacket", "M");
    item1.setPrice(20.9);

    Clothing item2 = new Clothing("Orange T-Shirt", "S");
    item2.setPrice(10.5);

    Clothing item3 = new Clothing("Blue T-Shirt", "S");
    item3.setPrice(10.5);

    Clothing item4 = new Clothing("Green Scarf", "S");
    item4.setPrice(5);

    Clothing[] items = {item1, item2, item2, item3, item4};

    c1.addItems(items);

    System.out.println("Items:");
    for (Clothing clothing : c1.getItems()) {
        System.out.println(clothing.getDescription() + ", " + clothing.getSize() + ", $" + clothing.getPrice());
      }

    System.out.println("Total: $" + c1.getTotalClothingCost());
  }
}
