/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Bryan Luis Valdez Jara <ibryan.valdez@gmail.com>
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.spring.project")
public class SpringProjectBootApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringProjectBootApplication.class);
        application.run();
    }
    
}
