import java.util.*;

public class CollegeList {
    public static void main(String[] args) {

        Student student = new Student();
        Faculty faculty = new Faculty();
        Employee employee = new Employee();

        String choice;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Press E for Employee, F for Faculty, or S for Students: ");
        choice = scanner.next();
        scanner.nextLine();

        if (choice.equalsIgnoreCase("E")) {
            System.out.println("Type employee's name, contact number, salary, and department.");
            System.out.println("Press ENTER after every input.");

            employee.setName(scanner.nextLine());
            employee.setContact(scanner.nextLine());
            employee.setSalary(scanner.nextDouble());
            scanner.nextLine();
            employee.setDepartment(scanner.nextLine());

            System.out.println("--- EMPLOYEE INFORMATION ---");
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Number: " + employee.getContact());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());
        }

        else if (choice.equalsIgnoreCase("F")) {

            System.out.println("Type employee's name, contact number, salary, department and press Y if you're a regular and N if not.");
            System.out.println("Press ENTER after every input.");

            faculty.setName(scanner.nextLine());
            faculty.setContact(scanner.nextLine());
            faculty.setSalary(scanner.nextDouble());
            scanner.nextLine();
            faculty.setDepartment(scanner.nextLine());

            String answer = scanner.next();

            if (answer.equalsIgnoreCase("Y")) {

                faculty.setRegular(true);

            } else if (answer.equalsIgnoreCase("N")) {

                faculty.setRegular(false);

            } else {

                System.out.println("Please choose a letter between Y and N.");
                return;
            }

            System.out.println("Name: " + faculty.getName());
            System.out.println("Contact Number: " + faculty.getContact());
            System.out.println("Salary: " + faculty.getSalary());
            System.out.println("Department: " + faculty.getDepartment());
            System.out.println("Regular: " + faculty.isRegular());
        }

        else if (choice.equalsIgnoreCase("S")) {
            System.out.println("Type Students's name, contact number, program, and year.");
            System.out.println("Press ENTER after every input.");

            student.setName(scanner.nextLine());
            student.setContact(scanner.nextLine());
            student.setProgram(scanner.nextLine());
            student.setYear(scanner.nextInt());

            System.out.println("--- STUDENT'S INFORMATION ---");
            System.out.println("Name: " + student.getName());
            System.out.println("Contact Number: " + student.getContact());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Year: " + student.getYear());
        }

        else {
            System.out.println("Invalid choice. Please enter E, F, or S.");
        }
        scanner.close();

    }
}