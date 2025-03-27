// Definim interfața Animal
interface Animal {
    String getType();
    String getSound();
}

// Implementare pentru un câine
class Dog implements Animal {
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String getSound() {
        return "Woof";
    }
}

// Implementare pentru o pisică
class Cat implements Animal {
    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public String getSound() {
        return "Meow";
    }
}

// Implementare pentru o vacă
class Cow implements Animal {
    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public String getSound() {
        return "Moo";
    }
}

public class AnimalSoundsApp {
    public static void main(String[] args) {
        // Cream o listă (aici folosim un array) cu animale
        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        // Iterăm prin lista de animale și afișăm mesajul cerut
        for (Animal animal : animals) {
            System.out.println(animal.getType() + " makes sound: " + animal.getSound());
        }
    }
}
