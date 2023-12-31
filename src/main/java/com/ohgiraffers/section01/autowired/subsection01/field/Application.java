package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ohgiraffers.section01"); // 이패키지 하위에 있는 애들은 컴포먼트 스캔이 된다.

        BookService bookService = applicationContext.getBean("bookServiceField", BookService.class);

        bookService.selectAllBooks().forEach(System.out::println);

        System.out.println(bookService.searchBookBySequence(1));
        System.out.println(bookService.searchBookBySequence(2));
    }
}
