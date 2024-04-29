package com.example.gokulcw2.gokulservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gokulcw2.gokulmodel.gokulBook;
import com.example.gokulcw2.gokulrepository.gokulBookRepo;

@Service
public class gokulBookService {
   @Autowired
   gokulBookRepo bookRepo;

   public gokulBook addBook(gokulBook book)
   {
        return bookRepo.save(book);
   }

   public List<gokulBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<gokulBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public gokulBook updateBook(int id,gokulBook book)
   {
        gokulBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else
        return null;
   }
}
