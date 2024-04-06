package IteratorDesignPattern;

import java.util.*;


    public class Client{

        public static void main(String[] args){

            List<Book> booksList = Arrays.asList(
                    new Book(100,"Science"),
                    new Book(299,"Maths"),
                    new Book(150,"English"),
                    new Book(400,"Drawing")
            );

            Library lib = new Library(booksList);
            Iterator iterator = lib.createIterator();

            while(iterator.hasNext()){
                Book book = (Book) iterator.next();
                System.out.println("Name of the book is " + book.getBookName());
            }
        }
    }