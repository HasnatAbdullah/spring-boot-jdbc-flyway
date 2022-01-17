package com.example.demo.movie;

import com.example.demo.actor.Actor;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Movie {
    private final Integer id;
    private final String name;
    private final List<Actor> actors;
    private final LocalDate releaseDate;

}