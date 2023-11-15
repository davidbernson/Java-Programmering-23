package codealongs.Collection.finished;
import java.util.*;

public class Registry {
    public static void main(String[] args) {
        Map<Integer, Employee> registry = new HashMap<>();

        registry.put(123, new Employee("Stefan", 29));
        registry.put(126, new Employee("Annika", 38));
        registry.put(872, new Employee("Nima", 22));
        registry.put(101, new Employee("Ushita", 42));

        List<Employee> employeesOver35 = getEmployeesByAge(registry, 35, 125);

        employeesOver35.forEach((e) -> System.out.println(e.name + ": " + e.age));       
    }

    static List<Employee> getEmployeesByAge(Map<Integer, Employee> registry, int lower, int upper) {
        List<Employee> returnedEmployees = new ArrayList<>();
        
        for (int id : registry.keySet()) {
            Employee e = registry.get(id);
            if (e.age >= lower && e.age <= upper) returnedEmployees.add(e);
        }
        return returnedEmployees;
    }
}

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "{"+age+"}";
    }
}