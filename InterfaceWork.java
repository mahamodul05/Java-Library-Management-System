package Interface;
import java.io.*;
import java.util.Scanner;
import Students.*;
import Teachers.*;
import Books.*;


interface InterfaceWork{
    public void borrow(Member p, Book b);
    public void returnBook(Member p, Book b);
    public void fine(Member p, double ammount);
}
