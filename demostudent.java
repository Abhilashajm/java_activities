class Student {
    private String name;
    private int id;
    private double GPA;
    public Student(String name, int id, double GPA) {
        this.name = name;
        this.id = id;
        this.GPA = GPA;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + GPA);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}

public class demostudent{
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 123456, 3.8);
        System.out.println("Initial Student Info:");
        student1.displayInfo();
        student1.setName("Jane Smith");
        student1.setId(654321);
        student1.setGPA(4.0);
        System.out.println("\nModified Student Info:");
        student1.displayInfo();
    }
}