package se318;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import static se318.Menus.Main_Menu;


public class Test 
{
     public static void main(String[] args) throws ClassNotFoundException, SQLException, UnsupportedEncodingException 
    {
        ConnectDB db = new ConnectDB();
        
        db.getConnection();
        
        Main_Menu();
        
        //System.out.println(ConnectDB.GivenCourses(1));
        
        //System.out.println(ConnectDB.Get_Attendance_Teacher(1));
        
        //System.out.println(ConnectDB.Total_Student());
        
        //ConnectDB.Increment_Absent(2);
        
        //System.out.println(ConnectDB.Get_All_Users());
        
        //System.out.println(ConnectDB.getData_Student("username1","password1"));
        
        //System.out.println(ConnectDB.getData_Teacher("username1","password1"));
        
        //System.out.println(ConnectDB.Check_For_Password("Admin","admin", "admin"));
        
        //System.out.println(ConnectDB.Check_For_Password("Teacher","", ""));
        
        //System.out.println(ConnectDB.Check_For_Password("Student","username2","password2"));
        
        //System.out.println(ConnectDB.Check_For_Password_Student("username1","password1"));

        //System.out.println(db.Check_For_Password_Admin("admin", "admin"));
        
        //ConnectDB.getFrom_Student();

        //ConnectDB.addTo_Student("Deneme", "username", "password",2 , 4);
        
        //ConnectDB.addTo_Teacher("Serhat Uzunbayır", "suzunbayır", "Herkese100");
        
        //ConnectDB.getFrom_Teacher();
        
        //db.addTo_Courses("SE318", 1, "Kaan Kurtel", "Summer");
        
        //ConnectDB.getFrom_Courses();

        //db.addTo_Attendance(1, "SE318", 2, 0);
        
        //ConnectDB.getFrom_Attendance();
        
        //db.addTo_Messages("Cem Evrendilek", "Atahan Ekici", "Merhabalar bu bir denemedir.");
        
        //ConnectDB.getFrom_Messages();
        
        //System.out.println(db.getAllTeacherNames());
        
        //db.DisplayAllTables();
        
         //System.out.println(db.getAllStudentNames());
    }  
}  