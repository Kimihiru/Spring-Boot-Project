package org.application.service;

import org.application.dao.PersonDao;
import org.application.dao.PersonJpaDao;
import org.application.dao.RedisDao;
import org.application.entity.NACheck;
import org.application.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("personService")
public class PersonService {
    @Autowired
    public PersonDao personDao;
    @Autowired
    public RedisDao redisDao;
    @Autowired
    public PersonJpaDao personJpaDao;
    @Transactional(rollbackFor=Exception.class)
    public Person save(Person person){
        return personDao.save(person);
    }

    @Transactional(rollbackFor=Exception.class)
    public List<Person> add(List<Person> person){
        return personJpaDao.saveAll(person);
    }
    public void insertByRedis(String flag,List<Person> person){
        redisDao.insertByRedis(flag,person);
    }

    public List<Person> findByRedis(String flag){
        return redisDao.findByRedis(flag);
    }

    public void deleteByRedis(String flag){
        redisDao.delete(flag);
    }
}
