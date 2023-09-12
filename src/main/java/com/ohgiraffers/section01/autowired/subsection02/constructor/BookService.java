package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("bookServiceConstructor")
public class BookService {

    private final BookDAO bookDAO;  //final 반드시 생성자를 통해 초기화 되어야 한다


    /* BookDAO 타입의 빈 객체를 이 프로퍼티에 자동으로 주입해준다. */
    /* Spring 4.3 버전 이후로는 생성자가 한 개 뿐이라면 @Autowired 어노테이션을 생략해도 자동으로 생성자 주입이 동작한다.
     * 단, 생성자가 1개 이상일 경우에는 명시적으로 작성을 해주어야 한다. */
    //@Autowired
    public BookService(BookDAO bookDAO) {this.bookDAO = bookDAO;}


    /* 도서 목록 전테 조회 */
    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    /* 도서 번호로 도서 조회 */
    public BookDTO searchBookBySequence(int sequence){
        return bookDAO.selectOneBook(sequence);
    }
}
