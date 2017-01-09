package sample.tests;


import sample.models.MatrixData;
import sample.models.Person;

/**
 * Created by Lelouch on 31.10.2016.
 */
public class MatrixTest {

    public static void main(String[] args) {

        Person person = new Person(1,7, 10, 1981, "Olga", "Tokiy","Female");
        Person person1 = new Person(2,1,10,1981,"Alex","Muzhykov","Male");
        MatrixData data = new MatrixData(person);
        MatrixData data1 = new MatrixData(person1);

        System.out.println(person);
        System.out.println(data);
        System.out.println(person1);
        System.out.println(data1);
    }
}
