package com.example.demo.actor;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Actor {
    private final Integer id;
    private final String name;
}
