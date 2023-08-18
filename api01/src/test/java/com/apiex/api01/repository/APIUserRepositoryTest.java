package com.apiex.api01.repository;

import com.apiex.api01.domain.APIUser;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;



@SpringBootTest
@Log4j2
public class APIUserRepositoryTest {
        @Autowired
        private PasswordEncoder passwordEncoder;

        @Autowired
        private APIUserRepository apiUserRepository;


    @Test
    public void testInserts() {
        IntStream.rangeClosed(1,100).forEach(i -> {
            APIUser apiUser = APIUser.builder()
                    .mid("apiuser"+i)
                    .mpw( passwordEncoder.encode("1111") )
                    .build();

            apiUserRepository.save(apiUser);
        });
        }

}