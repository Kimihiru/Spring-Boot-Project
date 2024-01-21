package org.application.dao;

import org.application.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonJpaDao extends JpaRepository<Person,Integer> {
}
