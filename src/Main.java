public class Main {
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = new Student[3];

        // Populating the array with student data
        students[0] = new Student("Johnson Tandoh", 24, new double[]{3.50, 3.48, 3.02, 3.60});
        students[1] = new Student("Janet Amankwah", 19, new double[]{4.0, 3.5, 3.73, 3.85});
        students[2] = new Student("Boakye Kelvin", 21, new double[]{3.70, 3.57, 3.47, 3.85});

        // Calculating and printing out the average grade for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("The average grade for " + students[i].getName() + " is " + students[i].getAverage());
        }
    }
}