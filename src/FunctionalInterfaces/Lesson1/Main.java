package FunctionalInterfaces.Lesson1;

public class Main {
    public static void main(String[] args) {
        SimpleGen simpleGen = new SimpleGen(5);

        /*Generate gen1 = simpleGen::getNumber;
        int temp = gen1.getNextElement();
        System.out.println(temp);*/

        Generate gen2 = SimpleGen::getRandomNumber;
        int temp = gen2.getNextElement();
        System.out.println(temp);

    }
}
