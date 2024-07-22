public class Animal_Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 100);
        do_animal_stuff(animal, "slow");
        Dog dog = new Dog();
        do_animal_stuff(dog, "fast");
        Dog yorkie = new Dog("Yorkie", 15);
        do_animal_stuff(yorkie, "fast");
        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        do_animal_stuff(retriever, "slow");
        Dog wolf = new Dog("wolf", 40);
        do_animal_stuff(wolf, "slow");
        Fish goldie = new Fish("goldfish", 0.25, 2, 3);
        do_animal_stuff(goldie, "fast");

    }

    public static void do_animal_stuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}
