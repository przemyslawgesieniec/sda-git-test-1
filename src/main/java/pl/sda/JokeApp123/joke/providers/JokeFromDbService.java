package pl.sda.JokeApp123.joke.providers;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.JokeApp123.joke.Joke;
import pl.sda.JokeApp123.joke.repository.JokeRepository;

@Service
@AllArgsConstructor
public class JokeFromDbService implements JokeService {

    private JokeRepository jokeRepository;

    @Override
    public Optional<Joke> getJoke(String category) {
        return jokeRepository
            .findByCategory(category)
            .map(jokeEntity -> new Joke(jokeEntity.getJokeValue(), jokeEntity.getCategory()));
    }

    @Override
    public List<String> getAvailableCategories() {
        return jokeRepository.getCategories();
    }

//    public Optional<Joke> getRandomJoke() {
//
//        long size = jokeRepository.count();
//        long randomIndex = new Random()
//            .longs(0, size - 1)
//            .findFirst()
//            .getAsLong();
//
//        return jokeRepository
//            .findById(randomIndex)
//            .map(jokeEntity ->
//                new Joke(jokeEntity.getJokeValue(), jokeEntity.getCategory()));
//
//    }
}
