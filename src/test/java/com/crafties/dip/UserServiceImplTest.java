package com.crafties.dip;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UserServiceImplTest {

    @Test
    public void should_create_user_with_hashed_password() {
        // given
        UserService userService = new UserServiceImpl();

        // when
        User user = userService.createUser("Bob", "secret");

        // then
        assertThat(user.firstName(), is("Bob"));
        assertThat(user.hashedPassword(), is("K7gNU3sdo+OL0wNhqoVWhr3g6s1xYv72ol/pe/Unols="));
    }

}