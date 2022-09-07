package pl.sda.JokeApp123.joke.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class JokeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String jokeValue;
    private String category;

    public JokeEntity(String jokeValue, String category) {
        this.jokeValue = jokeValue;
        this.category = category;
    }
}
