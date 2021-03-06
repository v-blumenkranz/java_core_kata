package Lecture4.AllTasks;

public class Test {
    Dog dog = new Dog();
    Animal b = dog; //восходящее преобразование - безопасное (присвоение объекту материнского типа типа наследника)
    //Мы превращаем абстрактное животное в собаку, и такой тип преобразования безопасен, поскольку
    //все методы и поля класса Animal применимы к объекту класса Dog, его наследнику
    //оъект переходит вверх по иерархии наследования
    //восходящие преобразования происходят неявно


    Animal animal = dog; //превращаем абстрактное животное в собаку
    Dog someDog = (Dog) dog; //нисходящее преобразование - небезопасно
    //объект переходит вниз по иерархии наследования
    //материнский класс может не содержать методов дочернего класса и это может привести к неправильной работе программы

    //при таки преобразованиях меняется не сам объект, а ссылка на него

    Animal someAnimal = new Animal();
    Dog newDog = (Dog) someAnimal; //нисходящее

    Dog someNewDog = new Dog();
    Animal someNewAnimal = (Animal) someNewDog; //восходящее

    public static void main(String[] args) {
        Animal someAnimal = new Animal();
        Dog newDog = (Dog) someAnimal; //нисходящее
        newDog.bark();
    }




}
