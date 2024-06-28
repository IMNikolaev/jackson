package quizzes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import quizzes.controllers.MyController;
import quizzes.entities.Book;

import java.util.List;


public class Main {
    public static String json;
    public static String json1;
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("quizzes");
        MyController controller = context.getBean(MyController.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
            json1 = mapper.writeValueAsString(controller.findAllBooks().get(0));
            json = mapper.writeValueAsString(controller.findAllBooks());
            System.out.println(json1);
        }
        catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(mapper.readValue(json1, Book.class));
            System.out.println(mapper.readValue(json, new TypeReference<List<Book>>() {}));
        }
        catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}