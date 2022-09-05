package pl.sda.JokeApp123.joke;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExternalApiJoke implements JokeService {

    private ObjectMapper objectMapper;
    private HttpClient httpClient;

    @Override
    public Optional<Joke> getJoke(String category) {

        if (category != null && category.equals("chuck norris")) {
            try {
                HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://api.chucknorris.io/jokes/random"))
                    .GET()
                    .build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

                return Optional.ofNullable(objectMapper.readValue(response.body(), Joke.class));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Optional.empty();
    }
}
