package Ex3;

class Student {
    private String sName;
    private String sID;
    private double gpa;

    public Student(String sName, String sID, double gpa) {
        this.sName = sName;
        this.sID = sID;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return sName + " - " + sID + " - " + gpa;
    }
}