package z_2_testFabricIndex.z_2_testFabricIndex;

//testmysql1

import java.sql.*;  
class MysqlCon{  
	public String dbConn(){  
		String result = "";
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://172.30.226.190:3306/sampledb","testmysql1","testmysql1");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select database()");  
			while(rs.next())  
				result = rs.getString(2);  
			con.close();  
		}catch(Exception e){ 
			result = e.getMessage();
			}  
		
		return result;
		
	}  
} 