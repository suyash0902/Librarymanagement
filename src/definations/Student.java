/*   Created by IntelliJ IDEA.
 *   Author: Suyash Srivastava (suyash0902)
 *   Date: 29-08-2020
 *   Time: 19:00
 *   File: Student.java
 */

package definations;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int noOfBooksIssued;
    private Book[] libraryBookIssued;

    //setter & getter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Book[] getLibraryBookIssued() {
        return libraryBookIssued;
    }

    public void setLibraryBookIssued(Book[] libraryBookIssued) {
        this.libraryBookIssued = libraryBookIssued;
    }

    public int getNoOfBooksIssued() {
        return noOfBooksIssued;
    }

    public void setNoOfBooksIssued(int noOfBooksIssued) {
        this.noOfBooksIssued = noOfBooksIssued;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }
    public Student(){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.noOfBooksIssued = noOfBooksIssued;
        this.libraryBookIssued = libraryBookIssued;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", noOfBooksIssued=" + noOfBooksIssued +
                ", libraryBookIssued=" + Arrays.toString(libraryBookIssued) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNoOfBooksIssued() == student.getNoOfBooksIssued() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Arrays.equals(getLibraryBookIssued(), student.getLibraryBookIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getMiddleName(), getLastName(), getUniversityRollNumber(), getNoOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getLibraryBookIssued());
        return result;
    }
    //this method will allow the student to issue book from library.
    public void issueBook (Book book) {
        System.out.println(book.getBookName() + " book is issued.");
    }
    //this method will allow the student to return book to library.
    public void returnBook (String bookName) {
        System.out.println("ThankYou for returning " + bookName + ".");
    }
    //this method provides you the list of books in the library.
    public void showAllBooksOfLibrary (){
        libraryBookIssued = new Book[9];
        for (int index = 0; index < 9; index++) {
            System.out.println("Book " + (index+1));
        }
    }
}

