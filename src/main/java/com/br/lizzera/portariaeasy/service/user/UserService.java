package com.br.lizzera.portariaeasy.service.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.lizzera.portariaeasy.data.IUserRepository;
import com.br.lizzera.portariaeasy.entities.User;

@Service
public class UserService implements IUserService{
    
    @Autowired
    private IUserRepository _userRepository;

    public String createUser(CreateUserRequest request){

        var user = new User(request.name, request.email, request.password);

        _userRepository.save(user);

        return user.getId().toString();
    
    }
}
