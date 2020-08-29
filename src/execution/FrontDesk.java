/*   Created by IntelliJ IDEA.
 *   Author: Suyash Srivastava (suyash0902)
 *   Date: 29-08-2020
 *   Time: 19:35
 *   File: FrontDesk.java
 */

package execution;

import definations.Book;
import definations.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Scanner firstName = new Scanner(System.in);
        System.out.println("Please enter the Following Detail's ");
        System.out.print("First Name : ");
        String fName = firstName.nextLine();
        Scanner middleName = new Scanner(System.in);
        System.out.print("Middle Name : ");
        String mName = middleName.nextLine();
        Scanner lastName = new Scanner(System.in);
        System.out.print("Last Name : ");
        String lName = lastName.nextLine();
        Scanner universityRollNumber = new Scanner(System.in);
        System.out.print("University Roll Number : ");
        long univRoll = universityRollNumber.nextLong();
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n" +
                "How may I help you today?\n" +
                "1. Issue a new book for me.\n" +
                "2. Return a previously issues book for me.\n" +
                "3. Show me all my issues books.\n" +
                "4. Exit.\n");
        int input;
        do {
            System.out.print("Enter the option : ");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    System.out.print("Enter Book Name : ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter Author Name : ");
                    String authorName = scanner.nextLine();
                    System.out.print("Enter ISBN Number of Book : ");
                    String isbnNumber = scanner.nextLine();
                    Book book = new Book(bookName, authorName, isbnNumber);
                    student.issueBook(book);
                    break;
                case 2:
                    System.out.print("Enter name of book which you want to return : ");
                    String returnBookName = scanner.nextLine();
                    student.returnBook(returnBookName);
                    break;
                case 3:
                    student.showAllBooksOfLibrary();
                    break;
                default:
                    System.out.println("ThankYou, Have a nice day.");
            }
        } while (input != 4);

    }
}

