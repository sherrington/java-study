import java.util.Arrays;

public class Department {
  public Department(String name, int size) {
    setName(name);
    this.size = size;
    employees = new Employee[size];
  }
  public Department(String name) {
    setName(name);
    employees = new Employee[10];
  }
  public Department(String name, Iterable<Employee> employees) {
    setName(name);
    addEmployees(employees);
  }
  int size;
  public int getCapacity(){
    return size;
  }
  String name;
  public void setName(String departmentName) {
    name = departmentName;
  }
  public String getName(){
    return name;
  }

  Employee[] employees;
  public void addEmployee(Employee employee){
    if(size != 0 && employees.length < size){
      employees[employees.length] = employee;
    }
  }

  public void addEmployees(Iterable<Employee> employees){
    for (Employee employee : employees) {
        addEmployee(employee);
    }
  }

  public Employee[] getEmployees(){
    return employees;
  }

  String printEmployees(){
    StringBuilder builder = new StringBuilder();
    Employee[] emps = Arrays.stream(getEmployees()).filter(emp -> emp != null).toArray(Employee[]::new);
    for (Employee employee : emps) {
      builder.append("\n " + employee);
    }
    return builder.toString();
  }

  public long getSize(){
    return Arrays.stream(getEmployees()).filter(emp -> emp != null).count();
  }

  @Override
  public String toString(){
    return getName() + " Capcity: " + getCapacity() + " Current Size: " + getSize()
    + "\n Employees: " + printEmployees();
  }
}
