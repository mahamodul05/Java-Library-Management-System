package Teachers;
import java.util.Scanner;
import java.io.*;
import Interface.*;

public class TeacherWork{
    File file = new File("Database/Teachers Data.txt");
    FileWriter fileWriter = null;
    FileReader fileReader = null;
    private String line;
    private boolean isContaintFound;
    private int count;
    private String id;
	Scanner in = new Scanner(System.in);

    public void insertTeacher(Teacher t){
        System.out.println("Please enter the teacher's library ID: ");
        int lid = in.nextInt();
        t.setId(lid);
        in.nextLine();
        System.out.println("Please enter the  teacher's ID: ");
        String tid = in.nextLine();
        t.setTeacherId(tid);
        System.out.println("Please enter the  teacher's Name: ");
        String tname = in.nextLine();
        t.setName(tname);
        System.out.println("Please enter the  teacher's Depertment Name: ");
        String tdepartmentName = in.nextLine();
        t.setDepartmentName(tdepartmentName);
        System.out.println("Please enter the  teacher's email: ");
        String temail = in.nextLine();
        t.setEmail(temail);
        System.out.println("Please enter the  teacher's contactNo: ");
        String tcontactNo = in.nextLine();
        t.setContactNo(tcontactNo);
        System.out.println("Please enter the  teacher's address: ");
        String saddress = in.nextLine();
        t.setAddress(saddress);
        System.out.println("Please enter the  teacher's amount: ");
        double tamount = in.nextDouble();
        t.setAmount(tamount);

    
            try {
            
                fileWriter = new FileWriter(file, true);
                fileWriter.write("\nLibrary ID: "+t.getId()+"\nTeacher ID: "+t.getTeacherId()+"\nName: "+t.getName() +"\nDepartment Name: "+t.getDepartmentName()+
                "\nEmail: "+t.getEmail()+"\nContact No: "+t.getContactNo()+"\nAddress: "+t.getAddress()+"\nAmount: "+t.getAmount());
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
                }
            }       
    }

    public Teacher getTeacher(int teacherId){
        Teacher teacher = new Teacher();
        id = Integer.toString(teacherId);
        int numberOfLinePrint = 7;
        try{
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = null;
            isContaintFound = false;
            count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(id)) {
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
        return teacher;
    }

    public void showAllTeachers(){
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