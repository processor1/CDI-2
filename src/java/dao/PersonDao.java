/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Person;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mobile Apps
 */
public class PersonDao {

    static List<Person> person;

    static {
        person = new ArrayList<>();
        Person p1 = new Person("Kwame", 13);
        Person p2 = new Person("James", 15);
        Person p3 = new Person("Hannha", 25);
    }

    public List<Person> getData() {
        return PersonDao.person;
    }
}
