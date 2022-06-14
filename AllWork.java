package Interface;
import java.io.*;
import java.util.Scanner;
import Students.*;
import Teachers.*;
import Books.*;

public class AllWork implements InterfaceWork {
    Scanner in = new Scanner(System.in);
    int choice;

    BookWork bookOp;
    TeacherWork teachOp;
    StudentWork studentOp;
    

    public void borrow(Member p, Book b){
        System.out.println("Enter Book ID: ");
        int bookId= in.nextInt();
        System.out.println("1. Teacher or 2. Student: ");
        int i = in.nextInt();
        if(i == '1'){
            System.out.println("Enter Teacher ID:");
            int teacherId = in.nextInt();         
            System.out.println("Please collect book. Thank you!");
        }

        else{
            System.out.println("Enter Student ID:");
            int studentId = in.nextInt();
            System.out.println("Please collect book. Thank you!");   
        }
    }

    public void returnBook(Member p, Book b){
        System.out.println("Enter Book ID: ");
        System.out.println("1. Teacher or 2. Student: ");
        int i = in.nextInt();
        if(i == 1){
            System.out.println("Enter Teacher ID:");
            System.out.println("Do you confirm?(Y/N): ");
            String a = in.nextLine();
			int g = in.nextInt();
            if(a == "Y" || a == "y"){
                System.out.println("Book has been returned.");
            }
            else{
                System.out.println("Book has not been returned.");
            }
        }

        else{
            System.out.println("Enter Student ID:");
            String a = in.nextLine();
			int g = in.nextInt();
            if(a == "Y" || a == "y"){
                System.out.println("Book has been returned.");
            }
            else{
                System.out.println("Book has not been returned.");
            }  
        }
    }

    public void fine(Member p, double amount){
        System.out.println("1.Teacher or 2. Student: ");
        choice = in.next().charAt(0);
		System.out.println("Work Done.");
    }
    
}