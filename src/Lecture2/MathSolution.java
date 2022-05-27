package Lecture2;

public class MathSolution {

    /**
     * Метод сравнивает сумму вещественных чисел a + b и число c.
     * Полезные ссылки по изучению сравнения вещественных чисел: https://javarush.ru/groups/posts/2136-ustroystvo-vejshestvennihkh-chisel
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static boolean doubleExpression(double a, double b, double c) {
        return (Math.abs((a + b) - c) < 0.0001);
    }
}
