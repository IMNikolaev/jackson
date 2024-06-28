package quizzes.repositories;

import quizzes.entities.Book;

import java.util.List;

public interface MyRepository {
    List<Book> findAll();
}
