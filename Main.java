package com.homework;

public class Main {
    public static void main(String[] args) {
        byte byteA = 1;
        byte byteB = 3;
        short shortA = -43;
        short shortB = 28;
        long longA = 102;
        long longB = -101;
        double doubleA = 1.6;
        double doubleB = -1.5;
        float floatA = 2.3f;
        float floatB = -1.3f;
        int intA = 1000001;
        int intB = -100000;
        /* all values of primitives */
        byte byteC = (byte) (byteA + byteB);
        byte byteD = (byte) (byteA - byteB);
        byte byteE = (byte) (byteA * byteB);
        byte byteF = (byte) (byteA / byteB);
        System.out.println("byte" + byteC);
        System.out.println("byte" + byteD);
        System.out.println("byte" + byteE);
        System.out.println("byte" + byteF);
        /* no bytes anymore */
        short shortC = (short) (shortA + shortB);
        short shortD = (short) (shortA - shortB);
        short shortE = (short) (shortA * shortB);
        short shortF = (short) (shortA / shortB);
        System.out.println("short" + shortC);
        System.out.println("short" + shortD);
        System.out.println("short" + shortE);
        System.out.println("short" + shortF);
        /* no shorts anymore */
        long longC = longA + longB;
        long longD = longA - longB;
        long longE = longA * longB;
        long longF = longA / longB;
        System.out.println("long" + longC);
        System.out.println("long" + longD);
        System.out.println("long" + longE);
        System.out.println("long" + longF);
        /* no longs anymore */
        double doubleC = doubleA + doubleB;
        double doubleD = doubleA - doubleB;
        double doubleE = doubleA * doubleB;
        double doubleF = doubleA / doubleB;
        System.out.println("double" + doubleC);
        System.out.println("double" + doubleD);
        System.out.println("double" + doubleE);
        System.out.println("double" + doubleF);
        /* no doubles anymore */
        float floatC = floatA + floatB;
        float floatD = floatA - floatB;
        float floatE = floatA * floatB;
        float floatF = floatA / floatB;
        System.out.println("float" + floatC);
        System.out.println("float" + floatD);
        System.out.println("float" + floatE);
        System.out.println("float" + floatF);
        /* no floats anymore */
        int intC = intA + intB;
        int intD = intA - intB;
        int intE = intA * intB;
        int intF = intA / intB;
        System.out.println("int" + intC);
        System.out.println("int" + intD);
        System.out.println("int" + intE);
        System.out.println("int" + intF);
        /* no ints anymore */
        /* THE END */
    }
}
