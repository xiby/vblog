package tech.xiby.vueblog.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.proxy.DruidDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Driver;

/**
 * 数据源配置
 * @author xiby
 */
@Component
public class DataSourceConfig {

    private DatabaseConfig databaseConfig;

    @Autowired
    public DataSourceConfig(DatabaseConfig databaseConfig){
        this.databaseConfig = databaseConfig;
    }

    @Bean
    public DataSource druidDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(databaseConfig.getUrl());
        dataSource.setUsername(databaseConfig.getUserName());
        dataSource.setPassword(databaseConfig.getPassword());
        dataSource.setDriverClassName(databaseConfig.getDriverClassName());
        return dataSource;
    }
}
