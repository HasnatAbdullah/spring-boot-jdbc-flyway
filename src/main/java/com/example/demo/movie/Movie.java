package com.example.demo.movie;

import com.example.demo.actor.Actor;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

//@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Movie {
    private final Integer id;
    private final String name;
    private final List<Actor> actors;
    private final LocalDate releaseDate;

    public Movie(@JsonProperty("id")Integer id,
                 @JsonProperty("name")String name,
                 @JsonProperty("actors")List<Actor> actors,
                 @JsonProperty("releaseDate")LocalDate releaseDate) {
        this.id = id;
        this.name = name;
        this.actors = actors;
        this.releaseDate = releaseDate;
    }

}