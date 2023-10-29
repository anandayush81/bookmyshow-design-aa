package lld3.bookmyshow.dtos;

import lld3.bookmyshow.enums.Language;
import lld3.bookmyshow.enums.MovieFeature;
import lld3.bookmyshow.models.Movie;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Enumerated;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CreateMovieRequest {
    private String name;
    private Double rating;
    private List<Language> languages = new ArrayList<>();
    private List<MovieFeature> features = new ArrayList<>();

    public Movie toMovie() {
        return Movie.builder()
                .name(name)
                .rating(rating)
                .features(features)
                .languages(languages)
                .build();
    }

}
