package com.sz.task.executor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author a3575 on 2017-11-18 23:32:42
 */
@Service
public class AsyncTaskService  {

    private final static Logger logger = LoggerFactory.getLogger(AsyncTaskService.class);

    @Async
    public void executePrientLog(int i){
        logger.info("Task"+i+" started.");
    }

    @Async("customExecutor")
    public void executePrientCustom(int i){
        logger.info("Task"+i+" started.");
    }

}
