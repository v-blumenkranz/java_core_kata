package Lecture3;

public class DogAndCat {

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat someCat) {
            System.out.println("Кошка поймана");
            sayHello();
            someCat.sayHello();
        }


    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.catchCat(cat);

    }
}
