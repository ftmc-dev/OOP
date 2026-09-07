abstract class Employees {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;
    private String salary;


    public Employees(String firstName, String lastName, String email, String password, String role, String salary) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.role = role;
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getSalary() {
        return salary;
    }

    public abstract void displayInfo();
    public abstract void Salary();

    public static class Developer extends Employees {
        public Developer(String firstName, String lastName, String email, String password, String role, String salary) {
            super(firstName, lastName, email, password, role, salary);
        }

        @Override
        public void Salary() {

        }
        public void displayInfo() {
            System.out.printf("First Names: " + this.getFirstName());
            System.out.printf("Last Name: " + this.getLastName());
            System.out.printf("Email: " + this.getEmail());
            System.out.printf("Password: " + this.getPassword());
            System.out.printf("Role: " + this.getRole());
        }
    }
    public static class Manager extends Employees {
        public Manager(String firstName, String lastName, String email, String password, String role, String salary) {
            super(firstName, lastName, email, password, role, salary);
        }
        @Override
        public void displayInfo() {
            System.out.printf("First Name: " + this.getFirstName());
            System.out.printf("Last Name: " + this.getLastName());
            System.out.printf("Email: " + this.getEmail());
            System.out.printf("Password: " + this.getPassword());
            System.out.printf("Role: " + this.getRole());
        }

        @Override
        public void Salary() {

        }

        public static class Interns extends Employees {
            public Interns(String firstName, String lastName, String email, String password, String role, String salary) {
                super(firstName, lastName, email, password, role, salary);
            }
            @Override
            public void displayInfo() {
                System.out.printf("First Name: " + this.getFirstName());
            }

            @Override
            public void Salary() {

            }
        }
        public static void main(String[] args) {
            Employees employees = new Developer("Jean", "Paul", "jean@gmail.com", "123", "Developer", "50000");
            employees.displayInfo();
            Employees employees1 = new Interns("Jean", "Paul", "jean@gmail.com", "123", "Developer", "50000");
            employees1.displayInfo();
            Employees employees2 = new Manager("Pierre", "Paule", "pierre@gmail.com", "123", "HRD", "50000");
            employees2.displayInfo();
            }
        }
    }

