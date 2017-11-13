package com.sz.scheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * @author a3575 on 2017-11-9 12:35:35
 */
@SpringBootApplication
@EnableEurekaClient
@EnableScheduling
public class ScheduledApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduledApplication.class, args);
    }

    @Scheduled(fixedRate = 1000)
    public void test(){
        System.out.println(new Date());
    }

}
