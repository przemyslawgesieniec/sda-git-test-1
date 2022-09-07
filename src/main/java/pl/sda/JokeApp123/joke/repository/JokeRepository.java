package pl.sda.JokeApp123.joke.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.sda.JokeApp123.joke.entity.JokeEntity;

@Repository
public interface JokeRepository extends JpaRepository<JokeEntity, Long> {

    @Query(value = "SELECT DISTINCT j.category FROM JokeEntity j")
    List<String> getCategories();

    Optional<JokeEntity> findByCategory(String category);
}
