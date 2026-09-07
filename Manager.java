public class Manager extends Employee {

    public Manager(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, password);
    }

    @Override
    public double calculateSalary(int prixParHeure, int nombreHeureParSemaine) {
        // Managers get a 20% bonus
        double baseSalary = prixParHeure * (nombreHeureParSemaine * 4);
        return baseSalary * 1.2; // 20% bonus
    }

    public void manageTeam() {
        System.out.println(getFirstName() + " is managing the team.");
    }
}