package duke.choice;

/**
 * Customer
 * 
 * @author sherrington
 */
public class Customer {

  private String name;
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  };
  
  private String size;
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
}