package quizzes.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import quizzes.entities.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class SecondRepository implements MyRepository{

    private final Map<Long, Book> books = Map.of(
            1L, new Book("Книга Map1", "Автор 5", 1902),
            2L, new Book("Книга Map2", "Автор 7", 1200),
            3L, new Book("Книга Map3", "Автор 1", 1802)
    );

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
}
