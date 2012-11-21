package de.synyx.examples.javaandjsanalysis;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Test;

public class HelloServiceTest {
	
	private HelloService service;
	
	@Before
	public void init() {
		service = new HelloService();
	}
	
	@Test
	public void sayHelloTest() {
		String result = service.sayHello("John");
		assertThat(result, is("Hello John"));
	}

}
