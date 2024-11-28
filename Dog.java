package New;

public class Dog {
    String breed;
    boolean hasOwner;
    int age;

    public Dog(String dogBreed, boolean dogOwned, int dogYears) {
        //Constructor invoked
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
}

    public static void main(String[] args) {
        //Main method started

        Dog fido = new Dog("poodle", false, 13);
        Dog nunzio = new Dog("corgi", true, 12);
        boolean isFidoOlder = fido.age > nunzio.age;
        int totalDogYears = nunzio.age + fido.age;
        System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
        System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
        System.out.println("The total age of the dogs is: " + totalDogYears);
        System.out.println("Main method finished");
    }
}
