package com.alex.one.service;

import com.alex.one.domain.User;
import com.alex.one.domain.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest                       // loads whole app context
@DataJpaTest                            // loads only in-memory db for jpa test
//@Import(UserService.class)            // loads only interface
@ComponentScan("com.alex.one.service")  // loads implementation
@AutoConfigureTestDatabase
public class UserServiceIntegrationTest {

//    @Autowired
//    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    public void shouldCreateUser() {
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        user.setPassword("password");

        User savedUser = userService.createUser(user);

        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isNotNull();
        assertThat(savedUser.getName()).isEqualTo("John Doe");
        assertThat(savedUser.getEmail()).isEqualTo("john.doe@example.com");
    }
}
