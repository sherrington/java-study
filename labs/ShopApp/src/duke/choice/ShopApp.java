package duke.choice;

public class ShopApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer();
        c1.name = "Pinky";

        System.out.println("Customer is " + c1.name + "!");
    }
}
