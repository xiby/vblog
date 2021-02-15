package tech.xiby.vueblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类
 * @author xiby
 */
@SpringBootApplication
@MapperScan("tech.xiby.vueblog.mappers")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
