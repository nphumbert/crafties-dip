package com.crafties.dip;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Sha256HashProviderTest {

    @Test
    public void should_hash_text_using_sha256_and_output_as_base64() {
        // given
        Sha256HashProvider hashProvider = new Sha256HashProvider();

        // when
        String hash = hashProvider.hash("text");

        // then
        assertThat(hash, is("mC2ePrmW9VnmM/TRlN7zdh2Qn1o7ZH0ahR/q1nwyydE="));
    }

}