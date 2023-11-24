package com.wanted.nothing;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    //    This @Autowired will tell compiler to init. the MovieRepository Class first !
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return  movieRepository.findAll();
    }


//    Here, we have used Optional because if that ID obj is not found than the function will return NULL and that we have to inform comp in advance.
//    public Optional<Movie> singleMovie(ObjectId id) {
//        return movieRepository.findById(id);
//    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
