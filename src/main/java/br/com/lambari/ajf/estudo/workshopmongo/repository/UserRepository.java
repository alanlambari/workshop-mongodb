package br.com.lambari.ajf.estudo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.lambari.ajf.estudo.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
