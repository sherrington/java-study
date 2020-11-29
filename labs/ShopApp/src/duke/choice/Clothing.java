package duke.choice;

public class Clothing {
  private final double MIN_PRICE = 10;
  private final double TAX_RATE = .2;

  private String description;
  private String size;
  private double price;

  public Clothing(String description, String size) {
    this.description = description;
    this.size = size;
  }

  public String getDescription(){
    return description;
  }

  public void setPrice(double price){
    this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
  }
  public double getPrice(){
    return price + (price * TAX_RATE);
  }

  public String getSize(){
    return size;
  }
}
