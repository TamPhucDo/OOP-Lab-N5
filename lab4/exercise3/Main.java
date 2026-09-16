public class Main {
    public static void main(String[] args) {
        Student std = new Student(101, "Tâm", "Ngô Minh");
        
        System.out.println(std.toString());
        System.out.println("Full Name: " + std.getName());
    }
}