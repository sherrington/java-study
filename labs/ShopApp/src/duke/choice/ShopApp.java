package duke.choice;

public class ShopApp {
  public static void main(String[] args) throws Exception {
    double tax = 0.2;
    
    System.out.println("Welcome to Duke Choice Shop!");
    
    Customer c1 = new Customer();
    c1.name = "Pinky";
    c1.size = "S";
    System.out.println("Customer is " + c1.name + "!");

    Clothing item1 = new Clothing();
    item1.description = "Blue jacket";
    item1.price = 20.9;
    item1.size = "M";

    Clothing item2 = new Clothing();
    item2.description = "Orange T-shirt";
    item2.price = 10.5;
    item2.size = "S";

    Clothing[] items = {item1, item2, item2};

    System.out.println("Item 1: " + item1.description + ", " + item1.size + ", $" + item1.price);
    System.out.println("Item 2: " + item2.description + ", " + item2.size + ", $" + item2.price);
    System.out.println("Item 3: " + item2.description + ", " + item2.size + ", $" + item2.price);

    double subTotal = item1.price + item2.price * 2;
    double total = subTotal + (subTotal * tax);
    System.out.println("Total: $" + total);

    int measurement = 3;

    switch(measurement){
      case 1, 2, 3:
        c1.size = "S";
        break;
      case 4, 5, 6:
        c1.size = "M";
        break;
      case 7, 8, 9:
        c1.size = "L";
        break;
      default:
        c1.size = "X";
    }
  }
}
