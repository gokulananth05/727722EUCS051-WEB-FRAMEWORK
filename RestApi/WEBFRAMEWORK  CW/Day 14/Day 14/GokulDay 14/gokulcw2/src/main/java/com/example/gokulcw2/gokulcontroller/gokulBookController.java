package com.example.gokulcw2.gokulcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gokulcw2.gokulmodel.gokulBook;
import com.example.gokulcw2.gokulservice.gokulBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class gokulBookController {
    @Autowired
    gokulBookService bookService;

    @PostMapping("/api/book")
    public gokulBook addBook(@RequestBody gokulBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public gokulBook updateBook(@PathVariable int id,@RequestBody gokulBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<gokulBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<gokulBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
