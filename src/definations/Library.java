/*   Created by IntelliJ IDEA.
 *   Author: Suyash Srivastava (suyash0902)
 *   Date: 29-08-2020
 *   Time: 18:46
 *   File: Library.java
 */

package definations;

public class Library {
    private Book[] availableLibraryBooks;

    public Library(Book[] availableLibraryBooks) {
        this.availableLibraryBooks = availableLibraryBooks;
    }

    public Book[] getAvailableLibraryBooks() {
        return availableLibraryBooks;
    }

    public void setAvailableLibraryBooks(Book[] availableLibraryBooks) {
        this.availableLibraryBooks = availableLibraryBooks;
    }

}

