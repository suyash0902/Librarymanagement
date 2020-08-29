/*   Created by IntelliJ IDEA.
 *   Author: Suyash Srivastava (suyash0902)
 *   Date: 29-08-2020
 *   Time: 19:00
 *   File: Student.java
 */

package definations;

import java.util.Arrays;

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
    public Student(String firstName, String middleName, String lastName, long universityRollNumber, int noOfBooksIssued, Book[] libraryBookIssued){
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
}

