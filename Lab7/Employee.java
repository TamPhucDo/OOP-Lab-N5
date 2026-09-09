public class Employee {
    protected String ID;
    protected String fullName;
    protected int yearJoined;
    protected double coefficientSalary;
    protected int numDaysOff;
    public Employee(){
        this.ID = "0";
        this.fullName = "";
        this.yearJoined = 0;
        this.coefficientSalary = 1.0;
        this.numDaysOff = 0;
    }
    
    public Employee(String ID, String fullName, double coefficientSalary){
        this.ID = ID;
        this.fullName = fullName;
        this.coefficientSalary = coefficientSalary;
        this.yearJoined = 2020;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, int yearJoined, double coefficientSalary, int numDaysOff){
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientSalary = coefficientSalary;
        this.numDaysOff = numDaysOff;
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getYearJoined() {
        return yearJoined;
    }
    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }
    public double getCoefficientSalary() {
        return coefficientSalary;
    }
    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }
    public int getNumDaysOff() {
        return numDaysOff;
    }
    public void setNumDaysOff(int numDaysOff) {
        this.numDaysOff = numDaysOff;
    }
    
    public double getSenioritySalary() {
        int years = 2026 - this.yearJoined;
        if(years >= 5){
            return years * 1150 / 100.0;
        }
        return 0;
    }
    public String considerEmulation(){
        if(numDaysOff <= 1){
            return "A";
        }
        else if(numDaysOff <= 3){
            return "B";
        }
        else{
            return "C";
        }
    }
    public double getSalary(){
        double basicSalary = 1150, emulationBonus = 0.0, senioritySalary = this.getSenioritySalary()    ;
        String considerEmulation = this.considerEmulation();
        if(considerEmulation.equals("A")){
            emulationBonus = 1;
        }
        else if(considerEmulation.equals("B")){
            emulationBonus = 0.75;
        }
        else if(considerEmulation.equals("C")){
            emulationBonus = 0.5;
        }
        double salary = basicSalary + basicSalary * (this.coefficientSalary + emulationBonus) + senioritySalary;
        return salary;
    }
}
