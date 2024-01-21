package org.application.entity;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table(name = "person")
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    public Integer uid;
    @Column(name = "uname")
    public String uname;
    @Column(name = "age")
    public Integer age;
    @Column(name = "jkm")
    public String jkm;
    @Column(name = "area_no")
    public Integer area_no;
//    @Column(name = "area_no",insertable = false,updatable = false,nullable = true)
//    public Integer area_no;
//    @ManyToOne(targetEntity = Area.class,optional = false,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JoinColumn(name = "area_no",nullable = false)
//    public Area area;

    public Person() {
    }

    public Person(Integer uid, String uname, Integer age, String jkm, Integer area_no) {
        this.uid = uid;
        this.uname = uname;
        this.age = age;
        this.jkm = jkm;
        this.area_no = area_no;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJkm() {
        return jkm;
    }

    public void setJkm(String jkm) {
        this.jkm = jkm;
    }

    public Integer getArea_no() {
        return area_no;
    }

    public void setArea_no(Integer area_no) {
        this.area_no = area_no;
    }

//    public Area getArea() {
//        return area;
//    }
//
//    public void setArea(Area area) {
//        this.area = area;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                ", jkm='" + jkm + '\'' +
                ", area_no=" + area_no +
                '}';
    }
}
