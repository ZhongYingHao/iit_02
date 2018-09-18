package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//告诉springboot不要检测数据源
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)

@SpringBootApplication
public class ManagerApp {

    public static void main(String [] args){
        SpringApplication.run(ManagerApp.class,args);
    }
}
