package Teachers;
import Interface.*;
public class Teacher extends Member{
	
    private String teacherId;

    public void setTeacherId(String teacherId){
        this.teacherId = teacherId;
    }
    public String getTeacherId(){
        return teacherId;
    }
    public void showInfo(){
		System.out.println("----Teacher Information----");
        System.out.println("Library ID        : "+getId());
        System.out.println("Teacher ID        : "+getTeacherId());
        System.out.println("Name              : "+getName());
        System.out.println("Department Name   : "+getDepartmentName());
        System.out.println("Email             : "+getEmail());
        System.out.println("Contact No        : "+getContactNo());
        System.out.println("Address           : "+getAddress());
        System.out.println("Amount            : "+getAmount());
    }   
}