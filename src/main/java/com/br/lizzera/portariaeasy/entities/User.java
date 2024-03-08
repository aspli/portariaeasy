package com.br.lizzera.portariaeasy.entities;

import java.util.UUID;

import lombok.Data;
@Data
public class User {

    private UUID id;
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.setId();
        this.name = name;
        this.email = email;
        this.password = password;
    }

    protected void setId(){
        this.id = UUID.randomUUID();
    }

    
}
