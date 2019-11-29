package com.homework;

public class Main {
    public static void main(String[] args) {
        byte ba = 1;
        byte bb = 3;
        short sa = -43;
        short sb = 28;
        long la = 102;
        long lb = -101;
        double da = 1.6;
        double db = -1.5;
        float fa = 2.3f;
        float fb = -1.3f;
        int ia = 1000001;
        int ib = -100000;
        /* all values of primitives */
        byte bc = (byte) (ba + bb);
        byte bd = (byte) (ba - bb);
        byte be = (byte) (ba * bb);
        byte bf = (byte) (ba / bb);
        System.out.println("byte"+bc);
        System.out.println("byte"+bd);
        System.out.println("byte"+be);
        System.out.println("byte"+bf);
        /* no bytes anymore */
        short sc = (short) (sa + sb);
        short sd = (short) (sa - sb);
        short se = (short) (sa * sb);
        short sf = (short) (sa / sb);
        System.out.println("short"+sc);
        System.out.println("short"+sd);
        System.out.println("short"+se);
        System.out.println("short"+sf);
        /* no shorts anymore */
        long lc = la + lb;
        long ld = la - lb;
        long le = la * lb;
        long lf = la / lb;
        System.out.println("long"+lc);
        System.out.println("long"+ld);
        System.out.println("long"+le);
        System.out.println("long"+lf);
        /* no longs anymore */
        double dc = da + db;
        double dd = da - db;
        double de = da * db;
        double df = da / db;
        System.out.println("double"+dc);
        System.out.println("double"+dd);
        System.out.println("double"+de);
        System.out.println("double"+df);
        /* no doubles anymore */
        float fc = fa + fb;
        float fd = fa - fb;
        float fe = fa * fb;
        float ff = fa / fb;
        System.out.println("float"+fc);
        System.out.println("float"+fd);
        System.out.println("float"+fe);
        System.out.println("float"+ff);
        /* no floats anymore */
        int ic = ia + ib;
        int id = ia - ib;
        int ie = ia * ib;
        int iF = ia / ib;
        System.out.println("int"+ic);
        System.out.println("int"+id);
        System.out.println("int"+ie);
        System.out.println("int"+iF);
        /* no ints anymore */
        /* THE END */

    }
}
