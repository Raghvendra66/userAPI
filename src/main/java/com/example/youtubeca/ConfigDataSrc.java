package com.example.youtubeca;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConfigDataSrc {
    @Bean("dataSource")
    public DataSource getDataSource(){
        DataSourceBuilder<?> dbs= DataSourceBuilder.create();
        dbs.driverClassName("org.postgresql.Driver");
        dbs.url("jdbc:postgresql://localhost:5432/Quotes");
        dbs.username("postgres");
        dbs.password("it123");
        return dbs.build();
    }
}
