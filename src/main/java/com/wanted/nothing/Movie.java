package com.wanted.nothing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
// Below @Data will take care of getters and setters of the class
@Data
// Below @AllArgsConstructor will take care of constructors
@AllArgsConstructor
// @No Args Constructor for no parameter constructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewIds;


}
