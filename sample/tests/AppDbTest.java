package sample.tests;

import sample.controllers.AppDB;
import sample.models.Person;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Lelouch on 03.12.2016.
 */
public class AppDbTest {


    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        AppDB appDB = new AppDB();
        Person person = new Person();
        person.setId(1);
        person.setLastName("Petechkin");

        Person person1 = new Person();
        person1.setId(2);
        person1.setLastName("Vasechkin");

        appDB.addPerson(person);
        appDB.addPerson(person1);


        System.out.println(appDB);

        appDB.findById(2);

    }
}
