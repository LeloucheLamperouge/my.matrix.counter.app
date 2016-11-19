package sample.tests;


import sample.models.MatrixDataCount;
import sample.models.Person;

/**
 * Created by Lelouch on 31.10.2016.
 */
public class MatrixTest {

    public static void main(String[] args) {

        Person person = new Person(7, 10, 1981, "Olga", "Tokiy","Female");
        MatrixDataCount data = new MatrixDataCount(person);
        System.out.println(person);
        System.out.println(data);
    }
}
