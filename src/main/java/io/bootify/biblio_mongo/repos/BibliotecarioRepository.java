package io.bootify.biblio_mongo.repos;

import io.bootify.biblio_mongo.domain.Bibliotecario;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BibliotecarioRepository extends MongoRepository<Bibliotecario, Long> {
}
