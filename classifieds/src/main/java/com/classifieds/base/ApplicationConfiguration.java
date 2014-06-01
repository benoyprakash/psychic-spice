package com.classifieds.base;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.jolbox.bonecp.BoneCPDataSource;

@Configuration
@EnableTransactionManagement
@ImportResource( { "classpath:application-context.xml" } )
@ComponentScan(basePackages = "com.classifieds")
@PropertySource({"classpath:application.properties" })
public class ApplicationConfiguration {

	private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";
	private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";
	private static final String PROPERTY_NAME_DATABASE_URL = "db.url";
	private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";

	private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
	private static final String PROPERTY_NAME_HIBERNATE_FORMAT_SQL = "hibernate.format_sql";
	private static final String PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY = "hibernate.ejb.naming_strategy";
	private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
	private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";
	private static final String PROPERTY_NAME_DATABASE_MIN_CONNECTION = "db.connection.min";
	private static final String PROPERTY_NAME_DATABASE_MAX_CONNECTION = "db.connection.max";
	private static final String PROPERTY_NAME_HIBERNATE_AUTO = "hibernate.hbm2ddl.auto";

	public ApplicationConfiguration(){
		
	}
	
	@Resource
	private Environment environment;

	@Bean
	public DataSource dataSource() {
		BoneCPDataSource dataSource = new BoneCPDataSource();

		dataSource.setDriverClass(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
		dataSource.setJdbcUrl(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
		dataSource.setUsername(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
		dataSource.setPassword(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
		dataSource.setMinConnectionsPerPartition(Integer.valueOf(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_MIN_CONNECTION)));
		dataSource.setMaxConnectionsPerPartition(Integer.valueOf(environment
				.getRequiredProperty(PROPERTY_NAME_DATABASE_MAX_CONNECTION)));
		return dataSource;
	}

//	@Bean
//	public JpaTransactionManager transactionManager()
//			throws ClassNotFoundException {
//		JpaTransactionManager transactionManager = new JpaTransactionManager();
//		return transactionManager;
//	}

//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean()
//			throws ClassNotFoundException {
//		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//
//		entityManagerFactoryBean.setDataSource(dataSource());
//		entityManagerFactoryBean
//				.setPackagesToScan(environment
//						.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));
//		
//		Properties jpaProterties = new Properties();
//		jpaProterties.put(PROPERTY_NAME_HIBERNATE_DIALECT, environment
//				.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
//		jpaProterties.put(PROPERTY_NAME_HIBERNATE_FORMAT_SQL, environment
//				.getRequiredProperty(PROPERTY_NAME_HIBERNATE_FORMAT_SQL));
//		jpaProterties.put(PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY, environment
//				.getRequiredProperty(PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY));
//		jpaProterties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, environment
//				.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));
//		jpaProterties.put(PROPERTY_NAME_HIBERNATE_AUTO,
//				environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_AUTO));
//
//		entityManagerFactoryBean.setJpaProperties(jpaProterties);
//
//		return entityManagerFactoryBean;
//	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public HibernateExceptionTranslator hibernateExceptionTranslator() {
		return new HibernateExceptionTranslator();
	}

}
