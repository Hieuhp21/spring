package com.example.de2.respository;

import com.example.de2.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRespository extends JpaRepository<Book, Integer> {
    //void deleteByBookId(Integer BookId);

}

