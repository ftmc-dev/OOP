public class Intern extends Employee {

    public Intern(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
    }

    @Override
    public double calculateSalary(int prixParHeure, int nombreHeureParSemaine) {
        // Interns get 50% of base salary
        double baseSalary = prixParHeure * (nombreHeureParSemaine * 4);
        return baseSalary * 0.5; // 50% of base
    }

    public void learn() {
        System.out.println(getFirstName() + " is learning.");
    }
}