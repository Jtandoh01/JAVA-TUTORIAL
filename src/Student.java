public class Student {
    //attributes
    private String name;
    private int age;
    private double[] grades;

    //constructor
    public Student(String name, int age, double[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getGrades() {
        return grades;
    }

    public double getAverage(){
        double total= 0.00;

        for (double grade: grades){
            total+=grade;
        }
        return total/grades.length;
    }
}
