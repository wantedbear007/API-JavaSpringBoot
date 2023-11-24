package com.wanted.nothing;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


// Controller basically handles the HTTPS requests, i.e GET POST etc
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;


    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
//    End point http://localhost:8080/api/v1/movies/6557774aee6bb896a45278d1
//    @Path is to tell the compiler that we'll be passing the variable that we got in the @GetMapping i.e ID

//    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id) {
//        return new ResponseEntity<>(movieService.singleMovie(id), HttpStatus.OK);
//    }

    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String id) {
        return new ResponseEntity<>(movieService.singleMovie(id), HttpStatus.OK);
    }



}
