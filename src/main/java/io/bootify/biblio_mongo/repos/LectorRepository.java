package io.bootify.biblio_mongo.repos;

import io.bootify.biblio_mongo.domain.Lector;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LectorRepository extends MongoRepository<Lector, Long> {
}
