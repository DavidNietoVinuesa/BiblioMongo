package io.bootify.biblio_mongo.repos;

import io.bootify.biblio_mongo.domain.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LibroRepository extends MongoRepository<Libro, Long> {
}
