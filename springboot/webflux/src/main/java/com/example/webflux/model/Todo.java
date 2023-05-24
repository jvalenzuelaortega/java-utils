package com.example.webflux.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties
public class Todo {

    private long userID;
    private long id;
    private String title;
    private boolean completed;
}
