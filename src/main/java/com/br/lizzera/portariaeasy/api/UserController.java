package com.br.lizzera.portariaeasy.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.lizzera.portariaeasy.service.user.CreateUserRequest;
import com.br.lizzera.portariaeasy.service.user.IUserService;

@RestController
public class UserController {
    @Autowired
    private IUserService _userService;

    public ResponseEntity<String> createUser(@RequestBody CreateUserRequest request){
        
        var response = _userService.createUser(request);
        
        return ResponseEntity.status(HttpStatus.CREATED).body("");
    }
    
}
