package de.workshops.bookshelf.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(BookController.REQUEST_URL)
@RequiredArgsConstructor
public class BookController {

    static final String REQUEST_URL = "/";

    @Value("${spring.application.bookshelf}")
        String appName;

    private final BookService bookService;

    @RequestMapping("/")
        public String homePage(Book Book) {
            book.addAttribute("appName", appName);
            return "home";
        }

    @GetMapping
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookService.getBooks());

        return "books";
    }

    @GetMapping("/success")
    public String redirectToSuccessUrl(Model model) {
        return getAllBooks(model);
    }
}
