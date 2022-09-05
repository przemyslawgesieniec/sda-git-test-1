package pl.sda.JokeApp123.joke;

import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JokeServiceSelector {

    private List<JokeService> jokeServices;

    public Optional<Joke> getJoke(String category) {

        if (category.equals("chuck norris")) {
            return jokeServices.get(0).getJoke(category);
        }
        else {
            jokeServices.get(1).getJoke(category);
        }
    }
}
