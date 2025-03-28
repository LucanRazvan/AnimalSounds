public class AnimalSoundsApp {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Cow() };
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + " makes sound: " + animal.getSound());
        }
    }
}
