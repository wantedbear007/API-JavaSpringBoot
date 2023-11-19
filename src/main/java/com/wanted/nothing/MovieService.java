package com.wanted.nothing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    //    This @Autowired will tell compiler to init. the MovieRepository Class first !
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return  movieRepository.findAll();
    }
}
