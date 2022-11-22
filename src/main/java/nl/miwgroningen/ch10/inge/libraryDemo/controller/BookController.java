package nl.miwgroningen.ch10.inge.libraryDemo.controller;

import nl.miwgroningen.ch10.inge.libraryDemo.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

/**
 * @author Inge Dikland
 * <p>
 * Geeft toegang tot alle pagina's over boeken
 */

@Controller
public class BookController {

    @GetMapping("/books")
    protected String showBookOverview(Model model) {
        ArrayList<Book> books = new ArrayList<>();
        Book book = new Book();
        book.setTitle("Blindsighted");
        book.setAuthor("Slaughter, Karin");
        books.add(book);

        model.addAttribute("allBooks", books);

        return "bookOverview";
    }
}
