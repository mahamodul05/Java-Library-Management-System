package Books;
import Interface.*;
import Students.*;
import Teachers.*;
import java.util.Scanner;


public class Book{
    private int id;
    private String title;
    private String subTitle;
	private double price;
    Author author;
    Publisher publisher;

    Scanner input = new Scanner(System.in);

    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setSubTitle(String subTitle){
        this.subTitle = subTitle;
    }
    public void setAuthor(Author author){
        this.author = author;
        System.out.println("Please give Author ID: ");
        int authorId = input.nextInt();
        input.nextLine();
        author.setId(authorId);
        System.out.println("Please give Author Name: ");
        String name = input.nextLine();
        author.setName(name);
        System.out.println("Please give Author Email: ");
        String email = input.nextLine();
        author.setEmail(email);
    }
    public void setPublisher(Publisher publisher){
        this.publisher = publisher;
        System.out.println("Please give Publisher ID: ");
        int publisherId = input.nextInt();
        input.nextLine();
        publisher.setId(publisherId);
        System.out.println("Please give Publisher Name: ");
        String name = input.nextLine();
        publisher.setName(name);
        System.out.println("Please give Publisher Contact NO: ");
        String contactNo = input.nextLine();
        publisher.setContactNo(contactNo);
    }  
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getSubTitle(){
        return subTitle;
    }
	public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

   

}