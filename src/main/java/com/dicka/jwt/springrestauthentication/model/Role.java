package com.dicka.jwt.springrestauthentication.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "role",
        catalog = "dbauthentication")
public class Role implements Serializable{

    @Id
    @Column(name = "idrole")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idrole;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;


    public int getIdrole(){
        return idrole;
    }

    public void setIdrole(int idrole){
        this.idrole = idrole;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
