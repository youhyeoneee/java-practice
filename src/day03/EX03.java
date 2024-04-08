package day03;

public class EX03 {
    public static void main(String[] args) {
        // class Garden
        // getSound(동물) : 매개변수.cry()
        // class Dog, Cat extends Pet
        // cry()
        Garden garden = new Garden();
        Cat cat = new Cat();
        Dog dog = new Dog();

        garden.getSound(cat);
        garden.getSound(dog);


    }


}
class Garden {

    void getSound(Pet pet) {
//        if (pet instanceof Dog) {
//            System.out.println("멍멍");
//        } else {
//            System.out.println("야옹");
//        }
        pet.cry();
    }
}

class Pet {
    void cry() {

    }
}

class Dog extends Pet {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}
class Cat extends Pet {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}