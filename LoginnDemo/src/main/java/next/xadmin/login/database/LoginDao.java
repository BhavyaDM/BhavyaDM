package next.xadmin.login.database;

import next.xadmin.login.bean.LoginBean;

public class LoginDao {
	private String dburl="jdbc:mysql://localhost:3307/userdb";
	private String dbuname="root";
	private String dbPassword="root";
	private String dbDriver="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	public boolean validate(LoginBean loginBean)
	{
		return false;
	}

}
