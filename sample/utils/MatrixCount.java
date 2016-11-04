package sample.utils;


/**
 * Created by Lelouch on 04.11.2016.
 */
public class MatrixCount {


    public int counter(int a) {

        int b = 0;
        int c = 0;
        int res = 0;

        if (a <= 22) {
            res = a;
            String data = Integer.toString(res);
            System.out.println(data);
        }
        if (a > 22) {
            res = b;
            while (a != 0) {
                b = b + (a % 10);
                a /= 10;
                String data = Integer.toString(res);
                System.out.println(data);
            }
            if (b <= 22) {
                res = b;
                String data = Integer.toString(res);
                System.out.println(data);
            }

            if (b > 22) {
                res = c;
                while (b != 0) {
                    c = c + (b % 10);
                    b /= 10;
                }
                String data = Integer.toString(res);
                System.out.println(data);
            }
        }
        return res;
    }

}

