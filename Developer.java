public class Developer extends Employee {

    public Developer(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
    }

    @Override
    public double calculateSalary(int prixParHeure, int nombreHeureParSemaine) {
        // Salary = hourly rate * hours per week * 4 weeks
        return prixParHeure * (nombreHeureParSemaine * 4);
    }

    public void writeCode() {
        System.out.println(getFirstName() + " is writing code.");
    }
}