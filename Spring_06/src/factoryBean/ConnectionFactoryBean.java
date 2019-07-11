package factoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.FactoryBean;

public class ConnectionFactoryBean implements FactoryBean<Connection>{

	@Override
	public Connection getObject() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/test";
		String username="root";
		String password="123456";
		Connection connection = DriverManager.getConnection(url, username, password);

		return connection;
	}

	@Override
	public Class<?> getObjectType() {
		return Connection.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
