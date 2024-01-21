package org.application.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class NACheck implements Serializable {
    Set<Person> set=new HashSet<Person>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NACheck naCheck = (NACheck) o;
        return Objects.equals(set, naCheck.set);
    }

    @Override
    public int hashCode() {
        return Objects.hash(set);
    }

    public Set<Person> getSet() {
        return set;
    }

    public void setSet(Set<Person> set) {
        this.set = set;
    }

}
