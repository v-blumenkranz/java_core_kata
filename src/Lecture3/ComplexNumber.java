package Lecture3;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComplexNumber number = (ComplexNumber) o;
        return (Double.compare(re, number.re) == (Double.compare(im, number.im)));
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = result + (int) re * 29;
        result = result + (int) im * 31;
        return result;
    }

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
        System.out.println(b.equals(a));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }


}
