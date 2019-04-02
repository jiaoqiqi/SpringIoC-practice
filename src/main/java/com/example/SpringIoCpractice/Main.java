package com.example.SpringIoCpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new FileSystemXmlApplicationContext("hello.xml");
    HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
    helloWorld.getHello();
  }
}
