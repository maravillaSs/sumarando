package com.example.accessingdatamysql;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SumaTests.class)
public class SumaTests {

	@Test
	public void contextLoads() {
		Assert.assertEquals(6, new Operaciones( ).suma(3, 3));
	}

}