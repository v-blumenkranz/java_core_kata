package Lecture2;

public class UnicodeTask {

    /**
     * Метод возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
     * @param a
     * @return
     */
    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

    public static void main(String[] args) {
        System.out.println(charExpression(1));
    }

}
