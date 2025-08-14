package myProject;

public class costructor {
	//class Student{
    String name;
    int rollNo;
    double marks;

    // 1. Default constructor
    costructor() {
        this.name = "Default Name";
        this.rollNo = 0;
        this.marks = 0.0;
    }

    // 2. Constructor with name and marks
    costructor(String name, double marks) {
        this.name = name;
        this.rollNo = 0; // default roll number
        this.marks = marks;
    }

    // 3. Constructor with name and roll number
    costructor(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = 0.0; // default marks
    }

    // 4. Constructor with name, roll number, and marks
    costructor(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Common print function
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    // Main method to test all constructors
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Zuvaria", 85.5);
        Student s3 = new Student("Bob", 102);
        Student s4 = new Student("Charlie", 103, 92.0);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
        s4.printDetails();
    }

}
