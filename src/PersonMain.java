public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("John Tandoh", 24, "");
        Person person2 = new Person("Keziah Boadi", 17, "");


        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        person1.setAddress("YA-03030-3737");
        System.out.println(person1.getAddress());
        System.out.println();

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        person2.setAddress("YA-67474-64774");
        System.out.println(person2.getAddress());
    }
}

