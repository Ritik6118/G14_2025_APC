package G14.Spring_JDBC_G14;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	String url="jdbc:mysql://127.0.0.1:3306/G14_db";
    	String user="root";
    	String pass="root";
    	
    	DataSource dc=new DriverManagerDataSource(url,user,pass);
    	JdbcTemplate jt=new JdbcTemplate(dc);
    	String query="insert into students (rollnumber,name,age) values(?,?,?)";
    	jt.update(query,50,"new Student",25);
    }
}
