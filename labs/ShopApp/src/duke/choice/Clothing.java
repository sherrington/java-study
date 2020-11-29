package duke.choice;

public class Clothing {
  private final double MIN_PRICE = 10;
  private final double TAX_RATE = .2;

  private String description;
  public void setDescription(String description){
    this.description = description;
  }
  public String getDescription(){
    return description;
  }

  private double price;
  public void setPrice(double price){
    this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
  }
  public double getPrice(){
    return price + (price * TAX_RATE);
  }

  private String size = "M";
  public void setSize(String size){
    this.size = size;
  }
  public String getSize(){
    return size;
  }
}
