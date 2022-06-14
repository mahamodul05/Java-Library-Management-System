package Students;
import java.util.Scanner;
import java.io.*;
import Interface.*;

public class StudentWork {
    File file = new File("Database/Students Data.txt");
    FileWriter fileWriter = null;
    FileReader fileReader=null;
    private String line;
    private boolean isContaintFound;
    private int count;
    private String id;
    private char choice;
	Scanner in=new Scanner(System.in);
	
    public void insertStudent(Student S){
        System.out.println("Please enter the  student's libary ID: ");
        int lid = in.nextInt();
        S.setId(lid);
        in.nextLine();	    
        System.out.println("Please enter the  student ID: ");
        String sid = in.nextLine();
        S.setStudentId(sid);	    
        System.out.println("Please enter the  student Name: ");
        String sname = in.nextLine();
        S.setName(sname);	    
        System.out.println("Please enter the  student Depertment Name: ");
        String sdepartmentName = in.nextLine();
        S.setDepartmentName(sdepartmentName);	    
        System.out.println("Please enter the  student email: ");
        String semail = in.nextLine();
        S.setEmail(semail);	    
        System.out.println("Please enter the  student contactNo: ");
        String scontactNo = in.nextLine();
        S.setContactNo(scontactNo);	
        System.out.println("Please enter the  student address: ");
        String saddress = in.nextLine();
        S.setAddress(saddress);	
        System.out.println("Please enter the  student amount: ");
        double samount = in.nextDouble();
        in.nextLine();
        S.setAmount(samount);	
        System.out.println("Please enter the  student Guardian Name: ");
        String sguardianName = in.nextLine();
        S.setGuardianName(sguardianName);	
        System.out.println("Please enter the  student guardian Contact No: ");
        String sguardianContactNo = in.nextLine();
        S.setGuardianContactNo(sguardianContactNo);

         try {            
            fileWriter = new FileWriter(file, true);
            fileWriter.write("\nLibrary ID: "+S.getId()+"\nStudent ID: " + S.getStudentId() + "\nName: "+ S.getName() +"\nDepartment Name: "+ S.getDepartmentName() +
            "\nEmail: "+ S.getEmail()+"\nContact No: "+ S.getContactNo()+ "\nAddress: " + S.getAddress()+"\nAmount: "+S.getAmount()+
             "\nGurdian Name: "+ S.getGuardianName()+ "\nGurdian Contact No: "+ S.getGuardianContactNo());
            System.out.println("\nInformation Sucessfully added!!");
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

    public Student getStudent(int studentID){
        Student student=new Student();
        id = Integer.toString(studentID);
        int numberOfLinePrint=10;
        try{
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line=null;
            isContaintFound=false;
            count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("Student ID: "+id)) {
                    isContaintFound = true;
                    System.out.println(line);
                    count++;
                    continue;
                }
                else if(isContaintFound && count < numberOfLinePrint){
                    count++;
                    System.out.println(line);
                }
                else if (isContaintFound && count == numberOfLinePrint) {
                    System.out.println(line);
                    isContaintFound = false;
                }
            }
        }
        catch(IOException io) {
            System.out.println("IOException caught!!");
        }
        finally {
            try {
                fileReader.close();
            }
            catch(IOException io) {
                System.out.println("Can not close the resource!!");
            }
        } 
        return student;
    }


    public void showAllStudents(){
        try{
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException io) {
            System.out.println("IOException caught!!");
        }
        finally {
            try {
                fileReader.close();
            }
            catch(IOException io) {
                System.out.println("Can not close the resource!!");
            }
        } 
    } 
}
