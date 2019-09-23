package com.Service;

import com.Bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListRep extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);
}
