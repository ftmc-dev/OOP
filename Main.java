public class Main {
    public static void main(String[] args) {
        System.out.println("=== OOP Employee Management System ===\n");

        // 1. Create employees
        Developer dev = new Developer("John", "Doe", "john@company.com", "pass123");
        Manager mgr = new Manager("Jane", "Smith", "jane@company.com", "pass456");
        Intern intern = new Intern("Bob", "Wilson", "bob@company.com", "pass789");

        // 2. Display employee information
        System.out.println("--- Employee Details ---");
        System.out.println(dev);
        System.out.println(mgr);
        System.out.println(intern);
        System.out.println();

        // 3. Calculate salaries
        System.out.println("--- Salary Calculations ---");
        System.out.println("Developer (30$/hr, 40hrs/week): $" + dev.calculateSalary(30, 40));
        System.out.println("Manager (40$/hr, 40hrs/week): $" + mgr.calculateSalary(40, 40));
        System.out.println("Intern (20$/hr, 40hrs/week): $" + intern.calculateSalary(20, 40));
        System.out.println();

        // 4. Display employee types
        System.out.println("--- Employee Types ---");
        for (Type type : Type.values()) {
            System.out.println("- " + type);
        }
        System.out.println();

        // 5. Test specific methods
        System.out.println("--- Actions ---");
        dev.writeCode();
        mgr.manageTeam();
        intern.learn();

        System.out.println("\n=== Program Completed ===");
    }
}