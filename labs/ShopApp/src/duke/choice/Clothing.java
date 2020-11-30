package duke.choice;

public class Clothing implements Comparable<Clothing>{
  public static final double MIN_PRICE = 10;
  public static final double TAX_RATE = .2;
  public enum Sizes {
    S,
    M,
    L,
    X
  }

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

  @Override
  public String toString(){
    return getDescription() + ", " + getSize() + ", $" + getPrice();
  }

  @Override
  public int compareTo(Clothing c) {
    return this.description.compareTo(c.description);
  }
}
