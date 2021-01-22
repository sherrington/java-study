public class HRApp {
    public static void main(String[] args) throws Exception {
      Department dep = new Department("Some Department", 25);
      Employee emp = new Employee(1, "John Smith", 18000);
      dep.addEmployee(emp);
        System.out.println(dep);
    }
}
