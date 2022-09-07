package pl.sda.JokeApp123.joke;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.JokeApp123.joke.providers.JokeService;

@Service
@AllArgsConstructor
public class JokeServiceSelector {

    private List<JokeService> jokeServiceList;

    public Joke getRandomJokeByCategory(String category) throws JokeException {
        if (category != null) {
            return jokeServiceList.stream()
                .filter(jokeService -> jokeService.getAvailableCategories().contains(category))
                .map(jokeService -> jokeService.getJoke(category))
                .findFirst()
                .orElseThrow(() -> new JokeException("Bad Joke entity"))
                .orElseThrow(() -> new JokeException("No joke available for this category"));
        }
        return new Joke("default joke", "none");
    }
}
