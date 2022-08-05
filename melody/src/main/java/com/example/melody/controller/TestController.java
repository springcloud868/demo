package com.example.melody.controller;

import com.example.melody.enums.NumberEnums;
import com.example.melody.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

/**
 * @author 86176
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private AsyncService asyncService;

    @Resource
    private ExecutorService callbackThreadPool;

    @Resource
    ThreadPoolTaskExecutor applicationTaskExecutor;

    @Resource
    ThreadPoolTaskExecutor threadPoolTaskExecutor;


    @RequestMapping(value = "/load", method = RequestMethod.POST)
    public CompletableFuture<String> contextLoads() throws InterruptedException {
        return asyncService.hello("async注解创建");
    }

    @RequestMapping("/pool")
    public String test () {
        callbackThreadPool.execute(() -> log.info("线程池执行任务代码块"));
        // 等待所有线程都执行完，再执行后续操作
        List<String> dataList = Arrays.asList("123","456");

        CompletableFuture<?>[] cfs = new CompletableFuture[3];
        int index = 0;
        for (String ignored : dataList) {
            // 每次循环创建一个线程0
            CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
                // 线程内执行的操作
                log.info("线程执行操作处理-----------");
            }, callbackThreadPool);
            cfs[index++] = cf;
        }
        // 此处等待监听的几个线程全部执行完
        CompletableFuture.allOf(cfs).join();
        return "hello world";
    }

    @GetMapping("/thread")
    public Object thread() {
        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(()->{
           for(int i=0; i<NumberEnums.THOUSAND.getSource(); i++) {
               log.info("a-"+i);
           }
        }, applicationTaskExecutor);
        CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(()->{
           for(int i=0; i<NumberEnums.THOUSAND.getSource(); i++) {
               log.info("w-"+i);
           }
        }, applicationTaskExecutor);
        CompletableFuture<Void> completableFuture3 = CompletableFuture.runAsync(()->{
           for(int i = 0; i< NumberEnums.THOUSAND.getSource(); i++) {
               log.info("a-"+i);
           }
        }, applicationTaskExecutor);

        CompletableFuture.allOf(completableFuture1, completableFuture2, completableFuture3);
        return "success";
    }

    @GetMapping("/thread-pool")
    public Object threadPool() {
        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(()->{
            for(int i=0; i<NumberEnums.THOUSAND.getSource(); i++) {
                log.info("a-"+i);
            }
        }, threadPoolTaskExecutor);
        CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(()->{
            for(int i=0; i<NumberEnums.THOUSAND.getSource(); i++) {
                log.info("w-"+i);
            }
        }, threadPoolTaskExecutor);
        CompletableFuture<Void> completableFuture3 = CompletableFuture.runAsync(()->{
            for(int i=0; i<NumberEnums.THOUSAND.getSource(); i++) {
                log.info("a-"+i);
            }
        }, threadPoolTaskExecutor);

        CompletableFuture.allOf(completableFuture1, completableFuture2, completableFuture3);
        return "success";
    }

}
