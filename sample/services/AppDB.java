package sample.services;

import sample.models.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lelouch on 01.12.2016.
 */
public class AppDB {

    private static int personIdCounter;
    private List<Person> persons;


    public AppDB() {
        persons = new ArrayList<>();
    }

    public Person addPerson(Person person) {
        person.setId(personIdCounter++);
        persons.add(person);
        return person;
    }

    public Person findPerson(String lastName) {
        for (Person person : persons
                ) {
            if (person.getLastName().equals(lastName))
                return person;

        }

        return null;
    }

    public Person findById(int id) {
        for (Person person : persons
                ) {
            if (person.getId() == id)

                return person;
        }
       return null;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "AppDB{" +
                "persons=" + persons +
                '}';
    }
}
