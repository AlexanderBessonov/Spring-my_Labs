package com.cydeo.lab04springmvc.service.impl;

import com.cydeo.lab04springmvc.model.Profile;

import java.time.LocalDateTime;

public class ProfileServiceImpl {

    Profile profile = new Profile("msmith@gmail.com","+1256342345","mike","smith","msmith", LocalDateTime.now());

}
/*
  private String email;
    private String phoneNumber;
    private String name;
    private String surname;
    private String userName;
    private LocalDateTime createdDate;
 */
