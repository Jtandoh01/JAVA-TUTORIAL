public class AnimalMain {
    public static void main(String[] args){
        Lion lion1 = new Lion("Leo Messi");
        Lion lion2 = new Lion("Petri");
        Tiger tiger1 = new Tiger("Memphis Depay");
        Tiger tiger2 = new Tiger("Mandava");
        Elephant elephant1 = new Elephant("Lukaku");
        Elephant elephant2 = new Elephant("Biggie");

        lion1.setAge(5);
        lion1.setAge(3);

        tiger1.setAge(7);
        tiger2.setAge(10);

        elephant1.setAge(28);
        elephant1.setAge(5);

        System.out.println("ANIMALS: THEIR NAMES,AGES AND THE TYPE OF SOUND THEY MAKE ") ;
        System.out.println();
        System.out.println("Lion: ");
        System.out.println(lion1.getName()+ " is "+lion1.getAge()+" years old and it " + lion1.makeSound());
        System.out.println(lion2.getName()+ " is "+lion2.getAge()+ " years old and it " + lion2.makeSound());
        System.out.println();
        System.out.println("Tiger: ");
        System.out.println(tiger1.getName()+ " is "+tiger1.getAge()+ " years old and it " + tiger1.makeSound());
        System.out.println(tiger2.getName()+ " is "+tiger2.getAge()+ " years old and it " + tiger2.makeSound());
        System.out.println();
        System.out.println("Elephant: ");
        System.out.println(elephant1.getName()+ " is "+elephant1.getAge()+ " years old and it " + elephant1.makeSound());
        System.out.println(elephant2.getName()+ " is "+elephant2.getAge()+ " years old and it " + elephant2.makeSound());


    }
}
