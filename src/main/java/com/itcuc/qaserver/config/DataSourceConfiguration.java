package com.itcuc.qaserver.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@SpringBootConfiguration
public class DataSourceConfiguration {



    @Value("${spring.datasource.driver-class-name}")
    private String jdbcDriver;
    @Value("${spring.datasource.url}")
    private String jdbcUrl;
    @Value("${spring.datasource.username}")
    private String jdbcUser;
    @Value("${spring.datasource.password}")
    private String jdbcPassword;
    @Value("${spring.datasource.maxActive}")
    private Integer maxPoolSize;
    @Value("${spring.datasource.maxWait}")
    private Integer maxIdleTime;
    @Value("${spring.datasource.minIdle}")
    private Integer minPoolSize;
    @Value("${spring.datasource.poolPreparedStatements}")
    private Integer maxStatements;
    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
    private Integer idleConnectionTestPeriod;
    @Value("${spring.datasource.validationQuery}")
    private String preferredTestQuery;
    @Value("${spring.datasource.testOnBorrow}")
    private Boolean testConnectionOnCheckin;
    @Value("${spring.datasource.testOnReturn}")
    private Boolean testConnectionOnCheckout;
    @Bean
    public DataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setDriverClass(jdbcDriver);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUser);
        dataSource.setPassword(jdbcPassword);
        dataSource.setMaxPoolSize(maxPoolSize);
        dataSource.setMaxIdleTime(maxIdleTime);
        dataSource.setMinPoolSize(minPoolSize);
        dataSource.setMaxStatementsPerConnection(maxStatements);
        dataSource.setIdleConnectionTestPeriod(idleConnectionTestPeriod);
        dataSource.setPreferredTestQuery(preferredTestQuery);
        dataSource.setTestConnectionOnCheckin(testConnectionOnCheckin);
        dataSource.setTestConnectionOnCheckout(testConnectionOnCheckout);
        dataSource.setAutoCommitOnClose(false);

        return dataSource;
    }
}