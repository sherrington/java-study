package duke.choice;

public class ShopApp {
  public static void main(String[] args) {
    System.out.println("Welcome to Duke Choice Shop!");
    
    Customer c1 = new Customer();
    c1.setName("Pinky");
    c1.setSize(3);
    System.out.println("Customer is " + c1.getName() + ", size: " + c1.getSize() + "!");

    Clothing item1 = new Clothing();
    item1.setDescription("Blue Jacket");
    item1.setPrice(20.9);
    item1.setSize("M");

    Clothing item2 = new Clothing();
    item2.setDescription("Orange T-Shirt");
    item2.setPrice(10.5);
    item2.setSize("S");

    Clothing item3 = new Clothing();
    item3.setDescription("Blue T-Shirt");
    item3.setPrice(10.5);
    item3.setSize("S");

    Clothing item4 = new Clothing();
    item4.setDescription("Green Scarf");
    item4.setPrice(5);
    item4.setSize("S");

    Clothing[] items = {item1, item2, item2, item3, item4};

    c1.addItems(items);

    System.out.println("Items:");
    for (Clothing clothing : c1.getItems()) {
        System.out.println(clothing.getDescription() + ", " + clothing.getSize() + ", $" + clothing.getPrice());
      }

    System.out.println("Total: $" + c1.getTotalClothingCost());
  }
}
