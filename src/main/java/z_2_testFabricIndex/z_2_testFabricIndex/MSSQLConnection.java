package z_2_testFabricIndex.z_2_testFabricIndex;



import java.sql.*;  
class MysqlCon{  
	public String dbConn(){  
		String result = "";
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/qwerty","qwerty","qwerty");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select database()");  
			while(rs.next())  
				result = rs.getString(2);  
			con.close();  
		}catch(Exception e){ System.out.println(e);}  
		
		return result;
		
	}  
} 