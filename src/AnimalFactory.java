public class AnimalFactory {
    public Animal getAnimal(String type) {
       if ("canine".equals(type)) {
           return new Dog();
       }else if ("feline".equals(type)){
           return new Cat();
       } else {
           return new Tiger();
       }
    }
}
