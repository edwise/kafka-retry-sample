package com.edwise.kafka.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=test")
public class ApplicationTest {

    @Test
    public void contextLoads() {
    }
}
