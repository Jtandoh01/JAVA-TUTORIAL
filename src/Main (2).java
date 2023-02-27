public class Main {
    public static void main(String[] args){
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        //setting attributes to employee1 object
        employee1.setName("Kevin Durant");//used KD coz he's my favorite NBA star
        employee1.setSalary(12.0);
        employee1.setPosition("Team Captain");
        employee1.setEmail("kd4ver@yahoo.com");
        employee1.setPhone("+1 63636 2523");

        //getting employee1 object attributes and print to the screen
        System.out.println("Employee1: ");
        System.out.println("Name: "+ employee1.getName());
        System.out.println("Salary: $"+employee1.getSalary()+"m");
        System.out.println("Position: " + employee1.getPosition());
        System.out.println("Email: "+ employee1.getEmail());
        System.out.println("Phone: "+ employee1.getPhone());
        System.out.println();

        //setting attributes to employee2 object
        employee2.setName("Sean Marks");
        employee2.setSalary(4.0);
        employee2.setPosition("General Manager");
        employee2.setEmail("sMarksmaster@gmail.com");
        employee2.setPhone("+1 22323 2332");

        //getting employee2 object attributes and print to the screen
        System.out.println("Employee2: ");
        System.out.println("Name: "+ employee2.getName());
        System.out.println("Salary: $"+employee2.getSalary()+"m");
        System.out.println("Position: " + employee2.getPosition());
        System.out.println("Email: "+ employee2.getEmail());
        System.out.println("Phone: "+ employee2.getPhone());


    }
}
