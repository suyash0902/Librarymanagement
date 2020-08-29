/*   Created by IntelliJ IDEA.
 *   Author: Suyash Srivastava (suyash0902)
 *   Date: 27-08-2020
 *   Time: 18:56
 *   File: Library.java
 */

package definations;

import java.util.Arrays;

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

    @Override
    public String toString() {
        return "Library{" +
                "availableLibraryBooks=" + Arrays.toString(availableLibraryBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getAvailableLibraryBooks(), library.getAvailableLibraryBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailableLibraryBooks());
    }
}

