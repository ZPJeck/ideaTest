package spring_04.factoryBrean;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;

import java.io.Reader;

public class SqlSessionFactoryBean implements FactoryBean<SqlSessionFactory> {
    @Override
    public SqlSessionFactory getObject() throws Exception {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        Reader reader = Resources.getResourceAsReader("spring_04/factoryBrean/mybatis-config.xml");
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
