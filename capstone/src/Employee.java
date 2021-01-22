import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
  public Employee(int id, String name, double salary) {
    setEmployeeId(id);
    setName(name);
    setSalary(salary);
  }

  int id;
  public void setEmployeeId(int id){
    this.id = id;
  }
  public int getEmployeeId(){
    return id;
  }

  double salary;
  public void setSalary(double salary){
    this.salary = salary;
  }
  public double getSalary() {
    return salary;
  }

  String firstName;
  String lastName;
  String preferredName;
  public void setPrerredName(String name)
  {
    preferredName = name;
  }

  public void setName(String firstLast)
  {
    String[] splitString = firstLast.split(" ");
    firstName = splitString[0];
    lastName = splitString[1];
  }
   public String getName(){
     if(preferredName.isEmpty()){
       return firstName + " " + lastName;
     }
     return preferredName + " " + lastName;
   }

   @Override
   public String toString() {
    NumberFormat toCurrencyString = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
     return getEmployeeId() + " " + getName() + " " + toCurrencyString.format(getSalary());
   }
}