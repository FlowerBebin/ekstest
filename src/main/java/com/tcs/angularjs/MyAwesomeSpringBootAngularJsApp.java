package com.tcs.angularjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAwesomeSpringBootAngularJsApp {

    public static void main(String[] args) {
        SpringApplication.run(MyAwesomeSpringBootAngularJsApp.class, args);
        
        MysqlConnection.mysqlConnect();
        /*  insertData("s6s","milon","dgh","ghjgh");
        deleteData("sd");
        countRow("dictionary");
        updateData("ss", "suru");
        showData("surayea");*/
        MysqlConnection.closeConnection();
        
    }
}
