package org.application.dao;

import org.application.entity.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Sakura
 */
public interface PersonDao extends CrudRepository<Person,Integer> {
}
