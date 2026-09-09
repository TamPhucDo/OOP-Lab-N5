public class Manager extends Employee {
    protected String position;
    protected String department;
    protected double salaryCoefficientPosition;

    public Manager(){
        super();
        this.position = "Head of Administrative Office";
        this.department = "Administration";
        this.salaryCoefficientPosition = 5.0;
    }

    public Manager(String ID, String fullName, double coefficientSalary, String position, double salaryCoefficientPosition){
        super(ID, fullName, coefficientSalary);
        this.yearJoined = 2024;
        this.numDaysOff = 0;
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
        this.department = "";
    }


    public Manager(String ID, String fullName, int yearJoined, double coefficientSalary, int numDaysOff, String position, String department, double salaryCoefficientPosition){
        super(ID, fullName, yearJoined, coefficientSalary, numDaysOff);
        this.position = position;
        this.department = department;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalaryCoefficientPosition() {
        return salaryCoefficientPosition;
    }

    public void setSalaryCoefficientPosition(double salaryCoefficientPosition) {
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    @Override
    public String considerEmulation(){
        return "A";
    }

    public double bonusByPosition(){
        double basicSalary = 1150;
        return basicSalary * this.salaryCoefficientPosition;
    }

    @Override
    public double getSalary(){
        double basicSalary = 1150;
        double emulationBonus = 1.0; // -> A
        double senioritySalary = this.getSenioritySalary();

        double salary = basicSalary + basicSalary * (this.coefficientSalary + emulationBonus) + senioritySalary + this.bonusByPosition();

        return salary;
    }
}