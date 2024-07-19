package io.sushmitha.movieinfoservice.resource;

import io.sushmitha.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {
    @RequestMapping("/{movieId}")
    public Movie getInfo(@PathVariable("movieId") String movieId) {

        return new Movie("Thor",movieId);
    }
}
