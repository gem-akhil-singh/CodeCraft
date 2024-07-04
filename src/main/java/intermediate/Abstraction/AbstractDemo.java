package intermediate.Abstraction;

public class AbstractDemo {
    public static void main(String[] args) {
        Employee contractor = new Contractor("Raju", 100, 5);
        Employee employee = new FullTimeEmployee("Rajan", 100);
        System.out.println(contractor.getName() + "'s Salary: " + contractor.calculateSalary());
        System.out.println(employee.getName() + "'s Salary: " + employee.calculateSalary());



    }
}
