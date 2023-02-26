public abstract class Animal {
    //properties
    private  final String name;
    private int age;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String makeSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
