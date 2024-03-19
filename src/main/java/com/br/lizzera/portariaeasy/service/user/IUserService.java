package com.br.lizzera.portariaeasy.service.user;

import java.util.List;

import com.br.lizzera.portariaeasy.entities.User;

public interface IUserService {
    String createUser(CreateUserRequest request); 
    List<User> getAllUser();   
}
