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
        dbs.url("jdbc:postgresql://ec2-44-209-24-62.compute-1.amazonaws.com:5432/d7n5h85jftp2g2");
        dbs.username("bqlcznvgkqsjmi");
        dbs.password("46f2cf8590e66d0eba33b258197ea4bcf8ae76d240977ee1d43a475149ce6398");
        return dbs.build();
    }
}
