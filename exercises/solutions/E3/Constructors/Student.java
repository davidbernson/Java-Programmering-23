package exercises.solutions.E3.constructors;

class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }


public static void main(String[] args) {
    Student student = new Student("Alice", 18, 90.5);
    student.printDetails();
    }
}


