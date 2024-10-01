package com.example.examen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void createUser() {

        UserService userService = new UserService();
        userService.createUser(new User("ale","231234","palza","morales"));
        assertEquals(userService.getUsers().size(), 1);
    }
}