package Lecture3;

import java.util.Arrays;

public class AsciiCharSequence {
    public static class ACS implements CharSequence{
        private byte [] byteArray;

        public ACS(byte [] array) {
            this.byteArray = array;
        }

        @Override
        public int length() {
            return byteArray.length;
        }

        @Override
        public char charAt(int index) {
            return (char) byteArray[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new ACS(Arrays.copyOfRange(byteArray, start, end));
        }

        @Override
        public String toString() {
            return new String(byteArray);
        }
    }

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        ACS answer = new ACS(example);
        System.out.println("Последовательность - " + answer.toString());   //Hello!
        System.out.println("Размер её - " + answer.length());   //6
        System.out.println("Символ под № 1 - " + answer.charAt(1));   //e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));   //ello
    }
}


