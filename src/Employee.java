public class Employee extends Person{

   //properties
    private double salary;
    private String jobTitle;

    public Employee(String name, int age, String gender){
        super();
    }

    //setters and getters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

}
