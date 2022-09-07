package pl.sda.JokeApp123.joke;

import lombok.AllArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jokes")
@AllArgsConstructor
public class JokeController {

    private JokeServiceSelector jokeServiceSelector;

    @GetMapping
    public Joke getJoke(@Nullable @RequestParam String category) throws JokeException {
        return jokeServiceSelector.getRandomJokeByCategory(category);
    }


}

