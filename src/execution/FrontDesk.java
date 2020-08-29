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
            System.out.println("Enter the option");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    System.out.println("Enter Book Name : ");
                    String bookName = scanner.nextLine();
                    System.out.println("Enter Author Name : ");
                    String authorName = scanner.nextLine();
                    System.out.println("Enter ISBN Number of Book");
                    String isbnNumber = scanner.nextLine();
                    Book book = new Book(bookName, authorName, isbnNumber);
                    student.issueBook(book);
                    break;
                case 2:
                    System.out.println("Enter name of book which you want to return");
                    String returnBookName = scanner.nextLine();
                    student.returnBook(returnBookName);
                    break;
                case 3:
                    student.showAllBooksOfLibrary();
                    break;
                default:
                    System.out.println("Invalid Option Entered, Please Re-Enter : ");
            }
        }while (input != 4);

    }
}
