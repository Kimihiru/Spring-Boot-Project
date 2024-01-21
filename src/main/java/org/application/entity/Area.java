package org.application.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "area")
public class Area implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "area_no")
    public Integer area_no;
    @Column(name = "area_name")
    public String area_name;
//    @OneToMany(targetEntity = Person.class,mappedBy = "area",fetch = FetchType.EAGER)
//    public Set<Person> set=new HashSet<Person>();

    public Area() {
    }

    public Area(Integer area_no, String area_name) {
        this.area_no = area_no;
        this.area_name = area_name;
    }

    public Integer getArea_no() {
        return area_no;
    }

    public void setArea_no(Integer area_no) {
        this.area_no = area_no;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

//    public Set<Person> getSet() {
//        return set;
//    }
//
//    public void setSet(Set<Person> set) {
//        this.set = set;
//    }
}
