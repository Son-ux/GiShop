package com.sondh.gishop.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class ConfigDataSource {
	@Value(value = "${database.driver.class.name}")
	private String driverClass;
	
	@Value(value = "${database.url}")
	private String url;
	
	@Value(value = "${database.username}")
	private String username;
	
	@Value(value = "${database.password}")
	private String password;
	
	@Bean("dataSource")
	public DataSource dataSource() {
		HikariConfig config = new HikariConfig();
		config.setDriverClassName(driverClass);
		config.setJdbcUrl(url);
		config.setUsername(username);
		config.setPassword(password);
		
		HikariDataSource ds = new HikariDataSource(config);
		
		return ds;
	}
	
    @Bean("transactionManager")
    public DataSourceTransactionManager transaction() {
        return new DataSourceTransactionManager(this.dataSource());
    }
	
    @Bean("sqlSessionFatory")
    public SqlSessionFactory sqlSessionFatory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		
		sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
				.getResources("classpath:com/sondh/gishop/sql/*.xml"));
		
		return sessionFactory.getObject();
	}
	
}
