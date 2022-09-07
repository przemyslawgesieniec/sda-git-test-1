package pl.sda.JokeApp123.joke.providers;

import java.util.List;
import java.util.Optional;
import pl.sda.JokeApp123.joke.Joke;

public interface JokeService {
    Optional<Joke> getJokeByCategory(String category);
    List<String> getAvailableCategories();
}
