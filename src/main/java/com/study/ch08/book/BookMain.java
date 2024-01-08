package com.study.ch08.book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookMenu = null;
        boolean loopFlag = true;


        Book[] books = new Book[3];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);


        while (loopFlag) {
            System.out.println("도서 관리 프로그램을 실행합니다.");
            System.out.println("도서 입력");
            System.out.println("도서 리스트");
            System.out.print("메뉴를 입력하세요 >>>");
            bookMenu = scanner.nextLine();
            if ("q".equalsIgnoreCase(bookMenu)) {
                System.out.println("bookMenu 실행을 종료합니다.");

                loopFlag = false;
            }
            if ("1".equals(bookMenu)) {
                System.out.println("책 도서 등록하세요");
                String title = null;
                String contents = null;
                
                System.out.print("책 제목 : ");
                title = scanner.nextLine();
                System.out.print("책 내용 : ");
                contents = scanner.nextLine();
                
                Book book = new Book(title, contents);
                for (int i = 0; i < books.length; i++) {
                    if (books[i] == null) {
                        books[i] = book;
                        break;
                    }
                }
                System.out.println(book.toString());
                
            } else if ("2".equals(bookMenu)) {
                System.out.println("도서 리스트를 조회합니다.");
                for (int i = 0; i < books.length; i++) {
                    if (books[i] == null) {
                        System.out.println("등록된 책이 없습니다.");
                        continue;
                    }
                    System.out.println(books[i].toString());
                }
            } else {
                System.out.println("다시 입력하세요 >>>");
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
