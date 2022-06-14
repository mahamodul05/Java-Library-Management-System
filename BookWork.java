package Books;
import java.io.*;
import java.util.Scanner;
import Students.*;
import Teachers.*;
import Interface.*;


public class BookWork{
    File file = new File("Database/bookinfo.txt");
    FileWriter fileWriter = null;
    FileReader fileReader = null;
    private String line;
    private int count;
    private char choice;
    private String id;
    private boolean bookStatus = true;
    private boolean doesContain;
    Author author; 
    Publisher publisher;
	Scanner input = new Scanner(System.in);
	
    public void insertBook(Book b){
		author=new Author();
		publisher=new Publisher();
        System.out.println("Enter the Book ID: ");
        int bookId=input.nextInt();
        b.setId(bookId);
        input.nextLine();
        System.out.println("Enter Book Title ");
        String bookTitle = input.nextLine();
        b.setTitle(bookTitle);
        System.out.println("Enter Book SubTitle: ");
        String subTitle = input.nextLine();
        b.setSubTitle(subTitle);
        System.out.println("\n\tAuthor details");        
        b.setAuthor(author);
        System.out.println("\n\tPublisher details");                
        b.setPublisher(publisher);       
        System.out.println("Enter Price: ");
        double price = input.nextInt();
        b.setPrice(price);

        
            try {            
                fileWriter = new FileWriter(file, true);
                 fileWriter.write("\nBook ID: " + b.getId() + "\nTitle: "+ b.getTitle() + "\nSubTitle: "+ b.getSubTitle() +
                 "\nAuthor ID: "+ author.getId() +"\nAuthor Name: "+ author.getName() + "\nAuthor Email: " + author.getEmail() +"\nPublisher ID: "+ publisher.getId() +
                 "\nPublisher Name: "+ publisher.getName() + "\nPublisher Contact NO: "+ publisher.getContactNo() + "\nBook Price:" + b.getPrice() );
                 System.out.println("\n\t\t\tInformation Sucessfully added!!!\t\t\t");
            }
            catch(IOException io) {
                System.out.println("IOException caught!!");
            }
            finally {
                try {
                    fileWriter.close();
                }
                catch(IOException io) {
                    System.out.println("Can not close the resource!!");
                }
            }             
    }

    public Book getBook(int bookId){
        Book book = new Book();
        id = Integer.toString(bookId);
        int numberOfLinePrint = 9;
        try{
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = null;
            doesContain = false;
            count = 0;
            while((line = bufferedReader.readLine())!= null){
                if(line.contains("Book ID: "+id)){
                    doesContain = true;
                    System.out.println(line);
                    count++;
                    continue;
                }
                else if(doesContain && count < numberOfLinePrint){
                    count++;
                    System.out.println(line);
                }
                else if(doesContain && count == numberOfLinePrint){
                    System.out.println(line);
                    doesContain = false;
                }
            }
        }

        catch(IOException io) {
            System.out.println("IOException caught!!");
        }

        finally{
            try{
                fileReader.close();

            }
            catch(IOException io){
                System.out.println("Can not close the resource!");
            }

        }
        return book;
    }

    public void showAllBooks(){
        try{
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
        }
        catch(IOException io){
            System.out.println("IOException caught!");
        }

        finally{
            try{
                fileReader.close();
            }
            catch(IOException io){
                System.out.println("Can not close the resource!");
            }
        }
    }
}