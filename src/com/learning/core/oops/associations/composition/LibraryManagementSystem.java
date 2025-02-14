package com.learning.core.oops.associations.composition;
import java.util.ArrayList;
import java.util.List;
 class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void displayBookInfo() {
            System.out.println("Title: " + title + ", Author: " + author);
        }
    }

    class Library {
        private List<Book> books;

        public Library() {
            books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("No books in the library.");
            } else {
                for (Book book : books) {
                    book.displayBookInfo();
                }
            }
        }

        public void clearLibrary() {
            books.clear();
            System.out.println("Library is destroyed. All books are removed.");
        }
    }

   public class LibraryManagementSystem {
        public static void main(String[] args) {
            Library library = new Library();

            library.addBook(new Book("Java", "AuthorJavaBook"));
            library.addBook(new Book("Python", "AuthorPythonBook"));

            library.displayBooks();

            // Destroy the library
            library.clearLibrary();
            System.out.println("Displaying the books info after destroying the library");
            library.displayBooks();
        }
    }


