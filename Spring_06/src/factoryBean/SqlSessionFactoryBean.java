package factoryBean;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;

public class SqlSessionFactoryBean implements FactoryBean<SqlSessionFactory>{

	@Override
	public SqlSessionFactory getObject() throws Exception {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		Reader reader = Resources.getResourceAsReader("factoryBean/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = builder.build(reader);
		return sqlSessionFactory;
	}

	@Override
	public Class<?> getObjectType() {
	 
		return SqlSessionFactory.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
