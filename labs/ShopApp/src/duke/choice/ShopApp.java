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
    item1.description = "Blue Jacket";
    item1.price = 20.9;
    item1.size = "M";

    Clothing item2 = new Clothing();
    item2.description = "Orange T-Shirt";
    item2.price = 10.5;
    item2.size = "S";

    Clothing item3 = new Clothing();
    item3.description = "Blue T-Shirt";
    item3.price = 10.5;
    item3.size = "S";

    Clothing item4 = new Clothing();
    item4.description = "Green Scarf";
    item4.price = 5;
    item4.size = "S";

    Clothing[] items = {item1, item2, item2, item3, item4};

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

    double total = 0;
    System.out.println("Items:");
    for (Clothing clothing : items) {
      if(total > 15) { break; }
      
      if(c1.size.equals(clothing.size)){
        System.out.println(clothing.description + ", " + clothing.size + ", $" + clothing.price);
        total = total + clothing.price + (clothing.price * tax);
      }
    }
    System.out.println("Total: $" + total);
  }
}
