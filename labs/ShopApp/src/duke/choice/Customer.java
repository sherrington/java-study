package duke.choice;

/**
 * Customer
 * 
 * @author sherrington
 */
public class Customer {
  private String name;
  private String size;

  public Customer(String name, int measurement) {
    this.name = name;
    setSize(measurement);
  }  

  public String getName(){
    return name;
  }
  
  public void setSize(String size){
    this.size = size;
  }
  public String getSize(){
    return size;
  }

  public void setSize(int size){
    switch(size){
      case 1, 2, 3:
        setSize("S");
        break;
      case 4, 5, 6:
        setSize("M");
        break;
      case 7, 8, 9:
        setSize("L");
        break;
      default:
        setSize("X");
    }
  }

  private Clothing[] items;
  public void addItems(Clothing[] items){
    this.items = items;
  }
  public Clothing[] getItems(){
    return items;
  }

  public double getTotalClothingCost(){
    double total = 0;
    for (Clothing clothing : items) {
      total = total + clothing.getPrice();
    }
    return total;
  }
}