package com.dicka.jwt.springrestauthentication.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "city",
        catalog = "dbauthentication")
public class City implements Serializable{

    @Id
    @Column(name = "idcity")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcity;

    @Column(name = "name", nullable = false)
    private String name;


    public int getIdcity(){
        return idcity;
    }

    public void setIdcity(int idcity){
        this.idcity = idcity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
