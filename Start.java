import java.util.Scanner;
import Teachers.*;
import Students.*;
import Interface.*;
import Books.*;


public class Start{
    public static void main(String[] args){
  
        StudentWork studentobj = new StudentWork();
        Student student = new Student();

        TeacherWork teacherobj = new TeacherWork();
        Teacher teacher = new Teacher();

        BookWork bookobj = new BookWork();
        Book book = new Book();

        AllWork allworkobj=new AllWork();
        Member member ;
        
		Scanner in=new Scanner(System.in);
    
        int i = 1;
        while(i != -1){
            System.out.println("\nMAIN MENU\n[1] Student Management\n[2] Teacher Management\n[3] Book Management\n[4] Basic Operations\n[5] Exit");
            System.out.println("Enter the choice:");
            int choice=in.nextInt();
           
            if(choice == 1){
                while(i != -2){
                    System.out.println("\nStudent Management\n[1] Insert New Student\n[2] Search by studentId\n[3] Show All Student\n[4] Main Manu\n");
                    System.out.println("Enter the choice:");
                    int student_choice = in.nextInt();
                    if(student_choice == 1){
                        studentobj.insertStudent(student);
                        continue;
                   }
                    else if(student_choice == 2){
                        System.out.println("Enter student ID:");
                        int id = in.nextInt();
                        studentobj.getStudent(id);
                        continue;
                    }
                    else if(student_choice == 3){
                        studentobj.showAllStudents();
                        continue;
                    }
                    else{
                        break;
                    }

                }
            }

            else if(choice == 2){
                while(i != -2){
                    System.out.println("\nTeacher Management\n[1] Insert New Teacher\n[2] Search by teacherId\n[3] Show All Teacher\n[4] Main Manu");
                    System.out.println("Enter the choice:");
                    int teacher_choice =in.nextInt();
                    if(teacher_choice == 1){
                        teacherobj.insertTeacher(teacher);
                        continue;
                    }
                
                    else if(teacher_choice == 2){
                        System.out.println("Enter teacher ID:");
                        int id = in.nextInt();
                        teacherobj.getTeacher(id);
                        continue;
                    }
                    else if(teacher_choice == 3){
                        teacherobj.showAllTeachers();
                        continue;
                    }
                    else{
                        break;
                    }
                
               }
                
           }
           else if(choice == 3){
            while(i != -2){
                System.out.println("\nBook Management\n[1] Insert New Book\n[2] Search by bookId\n[3] Show All Books\n[4] Main Manu\n");
                System.out.println("Enter the choice:");
                int teacher_choice =in.nextInt();
                if(teacher_choice == 1){
                    bookobj.insertBook(book);
                    continue;
                }
            
                else if(teacher_choice == 2){
                    System.out.println("Enter Book ID:");
                    int id = in.nextInt();
                    bookobj.getBook(id);
                    continue;
                }
                else if(teacher_choice == 3){
                    bookobj.showAllBooks();
                    continue;
                }
                else{
                    break;
                }
            
		}
           }

           else if(choice == 4){
            while(i != -2){
                System.out.println("\n Book Borrow/Return/Lost Management:\n[1] Borrow book\n[2] Return Book\n[3] Add Fine\n[4] Main Manu\n");
                System.out.println("Enter the choice:");
                int basic_choice = in.nextInt();

                if(basic_choice == 1){
                    member = student;
                    allworkobj.borrow(member,book);
                    continue;
                }
            
                else if(basic_choice == 2){
                    member = teacher;
                    allworkobj.returnBook(member,book);
                    continue;
                }
                else if(basic_choice == 3){
                    double amount;
                    member = student;
                    System.out.println("\n1.For book lost = 1000 taka\n2.For late return = 100 taka");
                    int fine_choice = in.nextInt();     
                        amount = 1000;
                        System.out.println("For lost book fine=1000 taka");
                        allworkobj. fine(member,amount);

                        continue;
                }
                else{
                    break;
                }
            
           }
           }

            else {
                
                break;
            }
            
        }
        
    }
}