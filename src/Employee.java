class Employee extends Person {
    private String department;
    private double salary;

    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}