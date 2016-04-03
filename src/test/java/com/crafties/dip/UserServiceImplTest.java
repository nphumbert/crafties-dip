package com.crafties.dip;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceImplTest {

    @Test
    public void should_create_user_with_hashed_password() {
        // given
        HashProvider hashProvider = mock(HashProvider.class);
        when(hashProvider.hash("secret")).thenReturn("hash");
        UserService userService = new UserServiceImpl(hashProvider);

        // when
        User user = userService.createUser("Bob", "secret");

        // then
        assertThat(user.firstName(), is("Bob"));
        assertThat(user.hashedPassword(), is("hash"));
    }

}