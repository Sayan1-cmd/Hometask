package com.project.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOX")
public class Box {

    public Box(){}

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @Column(name = "CONTAINED_IN")
    private Integer containedIn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContainedIn() {
        return containedIn;
    }

    public void setContainedIn(Integer containedIn) {
        this.containedIn = containedIn;
    }

    @Override
    public String toString() {
        return "Box{" + "id=" + id
                + ", containedIn=" + containedIn
                + '}';
    }
}