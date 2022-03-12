package com.learnDevTarang.MongoDBData.Repository;

import com.learnDevTarang.MongoDBData.Model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
  
public interface BookRepo
    extends MongoRepository<Book, Integer> {
}