package io.bootify.biblio_mongo.repos;

import io.bootify.biblio_mongo.domain.Prestamo;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PrestamoRepository extends MongoRepository<Prestamo, Long> {
}
