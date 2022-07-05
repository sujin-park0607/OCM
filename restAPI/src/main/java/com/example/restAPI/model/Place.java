package com.example.restAPI.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String host;
    private String location;
    private String title;
    private String content;
    private int price;
    private String tag;
    private String facility;
    private int wholeCount;
    private int cuurentCount;
}