package com.elifcan.j055_springbootdatajpa.controller;

import com.elifcan.j055_springbootdatajpa.entity.UserProfile;
import com.elifcan.j055_springbootdatajpa.service.UserProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-profile")
public class UserProfileController {
    // Contrustor Injection
    private final UserProfileService userProfileService;
    public UserProfileController(UserProfileService userProfileService){
        this.userProfileService = userProfileService;
    }

    @GetMapping("/default-create-user")
    public void defaultUserCreate(){
        userProfileService.save(UserProfile.builder()
                .age(36)
                .email("elif@mail.com")
                .name("Elif")
                .password("123456")
                .phone("5554446655")
                .username("elif")
                .build());
        userProfileService.save(UserProfile.builder()
                .age(31)
                .email("selim@mail.com")
                .name("Selim")
                .password("1456")
                .phone("5554545655")
                .username("selim")
                .build());
        userProfileService.save(UserProfile.builder()
                .age(18)
                .email("selin@mail.com")
                .name("Selin")
                .password("11212456")
                .phone("5554545688")
                .username("selin")
                .build());
    }
}
