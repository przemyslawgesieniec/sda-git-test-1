package pl.sda.JokeApp123.joke;

import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class JokeFromDbService implements JokeService{

    @Override
    public Optional<Joke> getJoke(String category) {
        return Optional.empty();
    }
}
