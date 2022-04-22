package com.gateway.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("test en cours d'execution ...!");
		assertEquals(true, true);
	}

}
