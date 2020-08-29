/*   Created by IntelliJ IDEA.
 *   Author: Suyash Srivastava (suyash0902)
 *   Date: 29-08-2020
 *   Time: 18:30
 *   File: Book.java
 */

package definations;

import java.util.Objects;

public class Book {
    //Creating member variable
    private String bookName;
    private String authorName;
    private String isbnNumber;

    //Parameterized constructor()
    public Book(String bookName, String authorName, String isbnNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbnNumber = isbnNumber;
    }

    //Setter Method & Getter Method()
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    //To-string() method
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", isbnNumber='" + isbnNumber + '\'' +
                '}';
    }

    //equals() and the hashCode() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getIsbnNumber(), book.getIsbnNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getIsbnNumber());
    }
}

