package com.example.SpringIoCpractice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringIoCPracticeApplicationTests {
	@Test
	public void contextLoads() {
		ApplicationContext ctxx = new FileSystemXmlApplicationContext("hello.xml");
		
		HelloWorld ho = (HelloWorld) ctxx.getBean("helloworld");
		ho.getHello();
	}
}
