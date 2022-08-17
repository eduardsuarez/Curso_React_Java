package com.Java_React.Java_React.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "suppliers")
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String email;
    private String phone;
    private String address;
    private String web;
    private  String contact;
}
