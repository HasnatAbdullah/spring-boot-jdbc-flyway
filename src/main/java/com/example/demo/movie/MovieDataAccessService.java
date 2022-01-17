package com.example.demo.movie;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class MovieDataAccessService implements MovieDao {

    private final JdbcTemplate jdbcTemplate;

    public MovieDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Movie> selectMovies() {
        String sql = "SELECT id, name, release_date FROM movie;";

        return jdbcTemplate.query(sql, new MovieRowMapper());
    }

    @Override
    public int insertMovie(Movie movie) {
        String sql = "INSERT INTO movie(name, release_date) VALUES (?, ?);";
        return jdbcTemplate.update(
                sql,
                movie.getName(),
                movie.getReleaseDate()
        );
    }

    @Override
    public int deleteMovie(int id) {
        String sql = "INSERT INTO movie(name, release_date) VALUES (?, ?);";

        return jdbcTemplate.update(sql, id);

    }

    @Override
    public Optional<Movie> selectMovieById(int id) {
        String sql = "INSERT INTO movie(name, release_date) VALUES (?, ?);";

        return jdbcTemplate.query(sql, new MovieRowMapper(), id)
                .stream()
                .findFirst();
    }

}
