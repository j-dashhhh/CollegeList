class Student extends Person {
    private String program;
    private int year;

    public void setProgram(String newProgram) {
        program = newProgram;
    }

    public String getProgram() {
        return program;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public int getYear() {
        return year;
    }
}