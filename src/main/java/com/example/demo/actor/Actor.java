package com.example.demo.actor;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Actor {
    private final Integer id;
    private final String name;
    private final String movie;

    public Actor(@JsonProperty("id")Integer id,
                 @JsonProperty("name")String name,
                 @JsonProperty("movie")String movie) {
        this.id = id;
        this.name = name;
        this.movie = movie;
    }
}
