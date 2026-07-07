package dev.yustanzah.movie.controllers;


import dev.yustanzah.movie.models.Movie;
import dev.yustanzah.movie.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/find-movie/{id}")
    public ResponseEntity<String> getMovies(@PathVariable String id){
        return new ResponseEntity<String>("This movies good " + id, HttpStatus.OK);
    }

    @GetMapping("/all-movies")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @PostMapping("/create-movies")
    public String createMovies(@RequestBody Movie data){
        String dataInput = data.getTitle();
        return "Movies Create" + dataInput;
    }

    @DeleteMapping("/remove-movie/{id}")
    public String deleteMovie(@PathVariable String id){
        return "Movies delete" + id;
    }

    @PutMapping("/update-movie/{id}")
    public String updateMovie(@PathVariable String id){
        return  "Movies Updated" + id;
    }
}
