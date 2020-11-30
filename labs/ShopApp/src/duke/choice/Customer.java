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
    for (Clothing clothing : getItems()) {
      total = total + clothing.getPrice();
    }
    return total;
  }

  private Clothing[] getLargeItems(){
    Clothing[] largeItems = {};
    if(getItems().length > 0){
      for(Clothing clothing : getItems()){
        if(clothing.getSize().equalsIgnoreCase(Clothing.Sizes.L.toString())){
          largeItems[largeItems.length] = clothing;
        }
      }
    }
    return largeItems;
  }

  public double getAveragePrice(){
    return getTotalClothingCost() / getLargeItems().length;
  }
}