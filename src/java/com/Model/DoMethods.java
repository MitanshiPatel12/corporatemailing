package com.Model;

import com.Bean.Master.*;
import static com.Model.DoMethods.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DoMethods 
{
    public static PreparedStatement ps;
    public static Connection con;
    public static ResultSet rs;
    int x=0;
    
   //----------------------------------------------------------------------------------
    //************************** INSERT QUERIES METHODS *******************************
    //----------------------------------------------------------------------------------
    
    
    public static void insertPost(MasterBean mb) throws SQLException, ClassNotFoundException
    {
       
       con=DBConnection.getConnection();
       
       String query1="INSERT into posts(PostName) values(?)";
       ps=con.prepareStatement(query1);
       ps.setString(1,mb.getPost());
       int a = ps.executeUpdate();
     
    }
    
     public static void insertSkill(MasterBean mb) throws SQLException, ClassNotFoundException
    {
       
       con=DBConnection.getConnection();
             
       String query2="INSERT into skills(SkillName) values(?)";
       ps=con.prepareStatement(query2);
       ps.setString(1,mb.getSkill());
       int b = ps.executeUpdate();
     
    }
     
     public static void insertState(MasterBean mb) throws SQLException, ClassNotFoundException
    {
       
       con=DBConnection.getConnection();
      
       String query3="INSERT into states(StateName) values(?)";
       ps=con.prepareStatement(query3);
       ps.setString(1,mb.getState());
       int c = ps.executeUpdate();
     
    }
     
    public static void insertCity(MasterBean mb) throws SQLException, ClassNotFoundException
    {
       
       con=DBConnection.getConnection();
       
       String query4="INSERT into cities(CityName,StateId) values(?,?)";
       ps=con.prepareStatement(query4);
       ps.setString(1,mb.getCity());
       ps.setString(2,mb.getStateId());
       int d = ps.executeUpdate();
       
    }
    
    public static void insertDesignation(MasterBean mb) throws SQLException, ClassNotFoundException
    {
       
       con=DBConnection.getConnection();
       
       String query5="INSERT into designations(DesignationName) values(?)";
       ps=con.prepareStatement(query5);
       ps.setString(1,mb.getDesignation());
       int e = ps.executeUpdate();
    }
  
    public static void insertAdminDetails(Admin_Sign_Up_Bean asub) throws SQLException, ClassNotFoundException
    {
       
       con=DBConnection.getConnection();
      
       String query6="INSERT into admindetails(Name,EmailId,Password,Gender,Address,City,State,DOB,UserName) values(?,?,?,?,?,?,?,?,?)";
       ps=con.prepareStatement(query6);

       ps.setString(1,asub.getName());
       ps.setString(2,asub.getEmail());
       ps.setString(3,asub.getPassword());
       ps.setString(4,asub.getGender());
       ps.setString(5,asub.getAddress());
       ps.setString(6,asub.getCity());
       ps.setString(7,asub.getState());
       ps.setString(8,asub.getDOB());
       ps.setString(9,asub.getUserName());
       
       int f = ps.executeUpdate();
     
    }
    
    public static void insertEmployeeRegistrationDetails(RegistrationEmployeeBean reb) throws SQLException, ClassNotFoundException
           {
               
               
           con=DBConnection.getConnection();
               
           String query6="INSERT into employee_details(FirstName,LastName,Gender,DateOfBirth,EmailId,ContactNo,Post,PrimarySkill,SecondarySkill,OtherSkill,UserName,Password,Street,City,State) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           ps=con.prepareStatement(query6);
           
            ps.setString(1,reb.getfirstname());
            ps.setString(2,reb.getlastname());
            ps.setString(3,reb.getgender());
            ps.setString(4,reb.getdateofbirth());
            ps.setString(5,reb.getemail());
            ps.setString(6,reb.getcontactno());
            ps.setString(7,reb.getpost());
            ps.setString(8,reb.getprimaryskill());
            ps.setString(9,reb.getsecondaryskill());
            ps.setString(10,reb.getotherskill());
            ps.setString(11,reb.getusername());
            ps.setString(12,reb.getpassword());
            ps.setString(13,reb.getaddress());
            ps.setString(14,reb.getcity());
            ps.setString(15,reb.getstate());
            
         
            int f=ps.executeUpdate();
                 
           }



 public static void insertProject(Project_Bean pb) throws SQLException, ClassNotFoundException
    {
       
       con=DBConnection.getConnection();
      
       String query7="INSERT into projects(ProjectName,Summary,StartingDate,EndingDate,Language,ClientName,ClientAddress,ClientCity,ClientState,ClientContactNo,ClientEmailId) values(?,?,?,?,?,?,?,?,?,?,?)";
       ps=con.prepareStatement(query7);
       ps.setString(1,pb.gettitle());
       ps.setString(2,pb.getsummary());
       ps.setString(3,pb.getstartingdate());
       ps.setString(4,pb.getendingdate());
       ps.setString(5,pb.getlanguage());
       ps.setString(6,pb.getclientname());
       ps.setString(7,pb.getaddress());
       ps.setString(8,pb.getcity());
       ps.setString(9,pb.getstate());
       ps.setString(10,pb.getcontactno());
       ps.setString(11,pb.getemail());
       
       int g = ps.executeUpdate();
     
    }
 
 public static void insertProjectAllocationDetail(ProjectAllocationBean pab) throws SQLException, ClassNotFoundException
    {
       
       con=DBConnection.getConnection();
       
       String query8="INSERT into project_allocation_details(ProjectId,EmployeeId) values(?,?)";
       ps=con.prepareStatement(query8);
       
       ps.setString(1,pab.getProjectId());
       ps.setString(2,pab.getEmployeeId());
       
       int h = ps.executeUpdate();
    }
    
    
    //----------------------------------------------------------------------------------
    //************************** UPDATE QUERIES METHODS*******************************
    //----------------------------------------------------------------------------------
    
 
  public static void updatePost(Post_Bean pb) throws SQLException, ClassNotFoundException
    {
        con=DBConnection.getConnection();
        
         String update1="UPDATE posts SET PostName=? WHERE PostId=?";
         ps=con.prepareStatement(update1);
         
         ps.setString(1,pb.getPost());
         ps.setString(2,pb.getPostId());
         int a = ps.executeUpdate();
    
    }
  
  public static void updateSkill(Skill_Bean sb) throws SQLException, ClassNotFoundException
    {
        con=DBConnection.getConnection();
        
         String update2="UPDATE skills SET SkillName=? WHERE SkillId=?";
         ps=con.prepareStatement(update2);
         
         ps.setString(1,sb.getSkill());
         ps.setString(2,sb.getSkillId());
         int b = ps.executeUpdate();
    
    }
  
  public static void updateState(State_Bean sb) throws SQLException, ClassNotFoundException
    {
        con=DBConnection.getConnection();
        
         String update3="UPDATE states SET StateName=? WHERE StateId=?";
         ps=con.prepareStatement(update3);
         
         ps.setString(1,sb.getState());
         ps.setString(2,sb.getStateId());
         int b = ps.executeUpdate();
    
    }
  
  
  
  public static void updateEmployeeDetails(RegistrationEmployeeBean reb) throws SQLException, ClassNotFoundException
           {
               
              
           con=DBConnection.getConnection();
               
           String query23="UPDATE employee_details SET FirstName=?,LastName=?,Gender=?,DateOfBirth=?,EmailId=?,ContactNo=?,UserName=?,Password=?,Street=?,City=?,State=? WHERE EmployeeId=? ";
           ps=con.prepareStatement(query23);
           
            ps.setString(1,reb.getfirstname());
            ps.setString(2,reb.getlastname());
            ps.setString(3,reb.getgender());
            ps.setString(4,reb.getdateofbirth());
            ps.setString(5,reb.getemail());
            ps.setString(6,reb.getcontactno());
            ps.setString(7,reb.getusername());
            ps.setString(8,reb.getpassword());
            ps.setString(9,reb.getaddress());
            ps.setString(10,reb.getcity());
            ps.setString(11,reb.getstate());
            ps.setString(12,reb.getuserid());
    
            int f1=ps.executeUpdate();
                 
           }
  
  public static void updateProject(Project_Bean pb) throws SQLException, ClassNotFoundException
           {
                
           con=DBConnection.getConnection();
               
           String query25="UPDATE projects SET ProjectName=?,Summary=?,StartingDate=?,EndingDate=?,Language=?,ClientName=?,ClientAddress=?,ClientCity=?,ClientState=?,ClientContactNo=?,ClientEmailId=? WHERE ProjectId=? ";
           ps=con.prepareStatement(query25);
           
            ps.setString(1,pb.gettitle());
            ps.setString(2,pb.getsummary());
            ps.setString(3,pb.getstartingdate());
            ps.setString(4,pb.getendingdate());
            ps.setString(5,pb.getlanguage());
            ps.setString(6,pb.getclientname());
            ps.setString(7,pb.getaddress());
            ps.setString(8,pb.getcity());
            ps.setString(9,pb.getstate());
            ps.setString(10,pb.getcontactno());
            ps.setString(11,pb.getemail());
            ps.setString(12,pb.getprojectid());

            int f2=ps.executeUpdate();
                 
           }
    
  //----------------------------------------------------------------------------------
    //************************** DELETE QUERIES METHODS*******************************
    //----------------------------------------------------------------------------------
 
  public static void deletePost(Post_Bean pb) throws SQLException, ClassNotFoundException
    {
        con=DBConnection.getConnection();
        
         String delete1="DELETE FROM posts WHERE PostId=?";
         ps=con.prepareStatement(delete1);
         
         ps.setString(1,pb.getPostId());
         int del1 = ps.executeUpdate();
    
    }
  
   public static void deleteSkill(Skill_Bean sb) throws SQLException, ClassNotFoundException
    {
        con=DBConnection.getConnection();
        
         String delete2="DELETE FROM skills WHERE SkillId=?";
         ps=con.prepareStatement(delete2);
         
         ps.setString(1,sb.getSkillId());
         int del2 = ps.executeUpdate();
    
    }
   
   public static void deleteState(State_Bean sb) throws SQLException, ClassNotFoundException
    {
        con=DBConnection.getConnection();
        
         String delete3="DELETE FROM states WHERE StateId=?";
         ps=con.prepareStatement(delete3);
         
         ps.setString(1,sb.getStateId());
         int del3 = ps.executeUpdate();
    
    }
   
   public static void deleteProject(Project_Bean pb) throws SQLException, ClassNotFoundException
    {
        con=DBConnection.getConnection();
        
         String delete4="DELETE FROM projects WHERE ProjectId=?";
         ps=con.prepareStatement(delete4);
         
         ps.setString(1,pb.getprojectid());
         int del4 = ps.executeUpdate();
    
    }
  
  
  
    //----------------------------------------------------------------------------------
    //************************** ARRAYLIST METHODS*******************************
    //----------------------------------------------------------------------------------
    
  
  public static ArrayList<Post_Bean> getPost() throws SQLException, ClassNotFoundException
  {
      
      
      con=DBConnection.getConnection();
      String query="SELECT * from posts";
      
      ps=con.prepareStatement(query);
      
      rs=ps.executeQuery();
      ArrayList al=new ArrayList();
      while(rs.next())
      {
         Post_Bean bean=new Post_Bean();
         bean.setPostId(rs.getString("PostId"));
         bean.setPost(rs.getString("PostName"));
         al.add(bean);
      }
      
      
      return al;
      
  }
  
  public static ArrayList<Skill_Bean> getSkill() throws SQLException, ClassNotFoundException
  {
      
      
      con=DBConnection.getConnection();
      String query="SELECT * from skills";
      
      ps=con.prepareStatement(query);
      
      rs=ps.executeQuery();
      ArrayList al=new ArrayList();
      while(rs.next())
      {
         Skill_Bean bean=new Skill_Bean();
         bean.setSkillId(rs.getString("SkillId"));
         bean.setSkill(rs.getString("SkillName"));
         al.add(bean);
      } 
      return al;  
  }
  
  public static ArrayList<State_Bean> getState() throws SQLException, ClassNotFoundException
  {
      
      
      con=DBConnection.getConnection();
      String query="SELECT * from states";
      
      ps=con.prepareStatement(query);
      
      rs=ps.executeQuery();
      ArrayList al=new ArrayList();
      while(rs.next())
      {
         State_Bean bean=new State_Bean();
         bean.setStateId(rs.getString("StateId"));
         bean.setState(rs.getString("StateName"));
         al.add(bean);
      }
      return al;   
  }
  
  public static ArrayList<City_Bean> getCity() throws SQLException, ClassNotFoundException
  {
      
      
      con=DBConnection.getConnection();
      String query="SELECT * from cities";
      
      ps=con.prepareStatement(query);
      
      rs=ps.executeQuery();
      ArrayList al=new ArrayList();
      while(rs.next())
      {
         City_Bean bean=new City_Bean();
         bean.setCityId(rs.getInt("CityId"));
         bean.setCity(rs.getString("CityName"));
         bean.setStateId(rs.getInt("StateId"));
         al.add(bean);
      }
      return al;
      
  }


public static ArrayList<Designation_Bean> getDesignation() throws SQLException, ClassNotFoundException
  {
      
      
      con=DBConnection.getConnection();
      String query="SELECT * from designations";
      
      ps=con.prepareStatement(query);
      
      rs=ps.executeQuery();
      ArrayList al=new ArrayList();
      while(rs.next())
      {
         Designation_Bean bean=new Designation_Bean();
         bean.setDesignationId(rs.getInt("DesignationId"));
         bean.setDesignation(rs.getString("DesignationName"));
         al.add(bean);
      }
      
      
      return al;
      
  }


public static ArrayList<Project_Bean> getProject() throws SQLException, ClassNotFoundException
  {
      
      
      con=DBConnection.getConnection();
      String query="SELECT * from projects";
      
      ps=con.prepareStatement(query);
      
      rs=ps.executeQuery();
      ArrayList al=new ArrayList();
      while(rs.next())
      {
         Project_Bean bean=new Project_Bean();
         
         bean.setprojectid(rs.getString("ProjectId"));
         bean.settitle(rs.getString("ProjectName"));
         bean.setsummary(rs.getString("Summary"));
         bean.setstartingdate(rs.getString("StartingDate"));
         bean.setendingdate(rs.getString("EndingDate"));
         bean.setlanguage(rs.getString("Language"));
         bean.setclientname(rs.getString("ClientName"));
         bean.setaddress(rs.getString("ClientAddress"));
         bean.setcity(rs.getString("ClientCity"));
         bean.setstate(rs.getString("ClientState"));
         bean.setcontactno(rs.getString("ClientContactNo"));
         bean.setemail(rs.getString("ClientEmailId"));

         
         al.add(bean);
      }
      
      return al;
      
  }

}

    //----------------------------------------------------------------------------------
    //**************************   *******************************
    //----------------------------------------------------------------------------------
    