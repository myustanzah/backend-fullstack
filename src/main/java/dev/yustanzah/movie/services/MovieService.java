package dev.yustanzah.movie.services;

import dev.yustanzah.movie.models.Movie;
import dev.yustanzah.movie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return  movieRepository.findAll();
    }
}
