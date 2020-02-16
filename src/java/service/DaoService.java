/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.inject.Inject;

import model.Person;
import dao.PersonDao;

import java.util.List;

/**
 *
 * @author Mobile Apps
 */
public class DaoService {

    @Inject
    PersonDao personDao;

    public List<Person> data() {
        return personDao.getData();
    }
}
