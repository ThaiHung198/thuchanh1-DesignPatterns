public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal a1 = animalFactory.getAnimal("canine");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("feline");
        System.out.println("a2 sound: " + a2.makeSound());

        Animal a3 = animalFactory.getAnimal("unknown");
        System.out.println("a3 sound: " + a3.makeSound());
    }
}
