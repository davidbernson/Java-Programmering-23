package codealongs.Collection.finished;
import java.util.*;

public class Registry {
    public static void main(String[] args) {
        Map<Integer, Employee> registry = new HashMap<>();

        registry.put(123, new Employee("Stefan", 29));
        registry.put(126, new Employee("Annika", 38));
        registry.put(872, new Employee("Nima", 22));
        registry.put(101, new Employee("Ushita", 42));

        System.out.println(registry.keySet());
        System.out.println(registry.values());

        
        System.out.println("Employees over 35 years of age: ");
        for (int id : registry.keySet()) {
            Employee e = registry.get(id);
            if (e.age > 35) System.out.println(e.name);
        }

        registry.keySet().forEach(
            (key) -> System.out.println(registry.get(key).name));
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