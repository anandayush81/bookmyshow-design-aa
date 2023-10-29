package lld3.bookmyshow.controllers;

import lld3.bookmyshow.dtos.CreateMovieRequest;
import lld3.bookmyshow.dtos.CreateShowRequest;
import lld3.bookmyshow.models.Movie;
import lld3.bookmyshow.models.Show;
import lld3.bookmyshow.services.MovieService;
import lld3.bookmyshow.services.ShowService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class MovieController {

    private MovieService movieService;

    @GetMapping("/movie/{id}")
    public Movie getMovie(@PathVariable Long id) {
        return movieService.getMovie(id);
    }

    @PostMapping("/movie")
    public Movie createMovie(@RequestBody CreateMovieRequest request) {
        return movieService.createMovie(request.toMovie());
    }
}