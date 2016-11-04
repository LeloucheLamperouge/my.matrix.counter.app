package sample.tests;

import sample.models.MatrixData;
import sample.models.Person;
import sample.utils.MCounter;
import sample.utils.MatrixCount;

/**
 * Created by Lelouch on 31.10.2016.
 */
public class MatrixTest {

    public static void main(String[] args) {

        Person person = new Person( 7, 10, 1981);
        MatrixData data = new MatrixData(person);
        System.out.println(person);
        System.out.println(data);
    }
}
