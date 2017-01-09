package sample.tests;

import sample.controllers.AppDB;
import sample.models.Person;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Lelouch on 03.12.2016.
 */
public class AppDbTest {

     private static int personIdCounter;

    public static void main(String[] args) {


        AppDB appDB = new AppDB();
        Person person = new Person(15,9,1984,"Petya","Petechkin","male");
        Person person1 = new Person(25,7,1956,"Vasya","Vasechkin","male");
        Person person2 = new Person(1,10,1981,"Alexandr","Muzhykov","male");
        Person person3 = new Person(7,10,1981,"Olga","Tokiy","female");

       person.setId(personIdCounter++);
       person1.setId(personIdCounter++);
       person2.setId(personIdCounter++);
       person3.setId(personIdCounter++);


        appDB.addPerson(person);
        appDB.addPerson(person1);
        appDB.addPerson(person2);
        appDB.addPerson(person3);

        System.out.println(appDB);



        System.out.println(appDB.findPerson("Vasechkin"));
        System.out.println(appDB.findPerson("Petechkin"));
        System.out.println(appDB.findPerson("Tokiy"));
        System.out.println(appDB.findPerson("Muzhykov"));
        System.out.println(appDB.findById(0));
        System.out.println(appDB.findById(2));
        System.out.println(appDB.findById(3));
        System.out.println(appDB.findById(1));
    }
}
