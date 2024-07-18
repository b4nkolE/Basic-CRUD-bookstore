package com.bankole;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/books")
@RestController
public class BookStoreController {

    private final BookStoreRepository bookStoreRepository;

    public BookStoreController(BookStoreRepository bookStoreRepository) {
        this.bookStoreRepository = bookStoreRepository;
    }

    @GetMapping
    public List<BookStore> getCustomer(){
        return bookStoreRepository.findAll();
    }



    @PostMapping
    public void addBook(@RequestBody NewBookRequest request) {
        BookStore bookStore = new BookStore();
        bookStore.setAuthor(request.author());
        bookStore.setTitle(request.title());
        bookStore.setGenre(request.genre());
        bookStore.setPrice(request.price());
        bookStoreRepository.save(bookStore);
    }


    @DeleteMapping ("{bookStoreId}")
    public void deleteBook(@PathVariable("bookStoreId") Integer id){
        bookStoreRepository.deleteById(id);
    }
}

