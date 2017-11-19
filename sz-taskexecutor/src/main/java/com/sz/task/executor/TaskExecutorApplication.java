package com.sz.task.executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author a3575 on 2017-11-18 22:50:28
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAsync
public class TaskExecutorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskExecutorApplication.class, args);
    }

}
