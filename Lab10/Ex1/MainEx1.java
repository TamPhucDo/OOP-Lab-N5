public class MainEx1 {
    public static void main(String[] args) {
        Student s = new Student("Hieu", "HCM", "Male", 7.5);

        Student.StudentOperator op = s.new StudentOperator();
        op.print();
        System.out.println("Rank: " + op.type());
    }
}