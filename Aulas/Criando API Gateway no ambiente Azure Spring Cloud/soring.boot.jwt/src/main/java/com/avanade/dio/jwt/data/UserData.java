package com.avanade.dio.jwt.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class UserData implements Serializable {

    private String userName;
    private String password;



}
