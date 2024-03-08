package com.br.lizzera.portariaeasy.data;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.lizzera.portariaeasy.entities.User;

public interface IUserRepository extends MongoRepository<User, UUID>{

    
}
