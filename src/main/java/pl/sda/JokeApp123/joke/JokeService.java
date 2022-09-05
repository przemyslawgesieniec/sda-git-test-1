package pl.sda.JokeApp123.joke;

import java.util.Optional;

public interface JokeService {
    Optional<Joke> getJoke(String category);
}
