package OOP;

 class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Employee extends Person {
    private int salary;

    public Employee(String name, int age, int salary) {
        super(name, age); // call the parent constructor with name and age
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

public class constructoroverrideMain {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        Employee employee = new Employee("Jane", 25, 50000);

        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge() + ", Salary: " + employee.getSalary());
    }
}
