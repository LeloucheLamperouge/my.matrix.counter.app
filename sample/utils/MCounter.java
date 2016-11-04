package sample.utils;

/**
 * Created by Lelouch on 04.11.2016.
 */
public class MCounter {

    public void countWithFor(int a) {

        int b = 0;
        int c = 0;

        if (a <= 22) {
            System.out.println(a);
        }
        if (a > 22) {
            for (int i = a; i != 0; i /= 10) {
                b = b + (i % 10);
            }
        if (b <= 22) {
                System.out.println(b);
            }
        if (b > 22) {
                for (int i = b; i != 0; i /= 10) {
                    c = c + (i % 10);
                }
                System.out.println(c);
            }
        }
    }
}