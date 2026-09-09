package Ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Alice", "S001", 3.5));
        list.add(new Student("Bob", "S002", 3.8));
        Ex3.writeFile("students.txt", list);
    }
}
