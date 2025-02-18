import java.util.*;
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Single Inheritance
// Multilevel Inheritance (Intermediate step) 

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + " teaches " + subject);
    }
}

// Multilevel Inheritance
class MathTeacher extends Teacher {
    public MathTeacher(String name, int age) {
        super(name, age, "Math");
    }

    public void solveEquation() {
        System.out.println(name + " is solving a math equation.");
    }
}

// Hierarchical Inheritance
class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println(name + " is studying for exams.");
    }
}

//Multiple Inheritance-Interface
interface Salary {
    void calculateSalary();
}

interface Evaluation {
    void evaluateStudent();
}

//Multiple Inheritance
class SchoolTeacher extends Teacher implements Salary, Evaluation {
    double baseSalary;
    
    public SchoolTeacher(String name, int age, String subject, double baseSalary) {
        super(name, age, subject);
        this.baseSalary = baseSalary;
    }

    // Implement Salary interface method
    public void calculateSalary() {
        System.out.println(name + "'s salary is Rs." + baseSalary);
    }

    // Implement Evaluation interface method
    public void evaluateStudent() {
        System.out.println(name + " is evaluating student performance.");
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Single and Multilevel Inheritance 
        MathTeacher mathTeacher = new MathTeacher("Rajesh", 35);
        mathTeacher.displayInfo();  // Inherited from Person
        mathTeacher.teach();        // Inherited from Teacher
        mathTeacher.solveEquation(); 
        System.out.println();

        // Hierarchical Inheritance 
        Student student = new Student("Prem", 17, "A");
        student.displayInfo();  // Inherited from Person
        student.study();
        System.out.println();

        // Multiple Inheritance using Interfaces
        SchoolTeacher schoolTeacher = new SchoolTeacher("Renu", 20, "English", 25000);
        schoolTeacher.displayInfo();  // Inherited from Person
        schoolTeacher.teach();        // Inherited from Teacher
        schoolTeacher.calculateSalary(); // Implemented from Salary interface
        schoolTeacher.evaluateStudent(); // Implemented from Evaluation interface
    }
}
