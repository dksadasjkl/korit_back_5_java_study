package com.study.ch08.book;

import com.study.ch08.car.Car;

public class BookRepository {
    Book[] books;

    BookRepository(Book[] books) {
        this.books = books;
    }

    // 값이 없다면 순회해서 i번째 인덱스를 리턴
    int getEmptyIndex() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                return i;
            }
        }
        return -1;
    }

    // 리턴 받은 값 많큼 방에 넣어라
    void inset(Book book) {
        books[getEmptyIndex()] = book;
    }

    Book[] getBooks() {
        int num = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                num++;
            }
        }
        return books;
    }


}
