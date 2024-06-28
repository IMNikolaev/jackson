package quizzes.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import quizzes.entities.Book;
import quizzes.services.MyService;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MyController {

    private final MyService myService;

    public List<Book> findAllBooks(){
        return myService.findAll();
    }
}
