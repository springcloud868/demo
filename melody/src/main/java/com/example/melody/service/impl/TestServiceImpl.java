package com.example.melody.service.impl;

import com.example.melody.config.DifThreadPoolConfig;
import com.example.melody.enums.NumberEnums;
import com.example.melody.service.TestService;
import com.example.melody.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/**
 * @author zyh
 */
@Slf4j
@Service
public class TestServiceImpl implements TestService {


    @Resource
    DifThreadPoolConfig difThreadPoolConfig;

    @Resource
    private ExecutorService callbackThreadPool;

    @Resource
    ThreadPoolTaskExecutor applicationTaskExecutor;

    @Resource
    ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Resource
    private RedisUtil redisUtil;


    @Override
    public CompletableFuture<String> hello(String name) throws InterruptedException {
        log.info("异步线程启动started." + name);
        Executor executor = difThreadPoolConfig.taskExecutor();
        executor.execute(() -> log.info("21111111111"));
        Thread.sleep(1000);
        return CompletableFuture.completedFuture("threadPoolTaskExecutor 创建线程");
    }

    @Override
    public void testThreadPool() {
        callbackThreadPool.execute(() -> log.info("线程池执行任务代码块"));
        // 等待所有线程都执行完，再执行后续操作
        List<String> dataList = Arrays.asList("123", "456");

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
    }

    @Override
    public void testThread() {
        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(() -> {
            for (int i = 0; i < NumberEnums.THOUSAND.getSource(); i++) {
                log.info("a-" + i);
            }
        }, applicationTaskExecutor);
        CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(() -> {
            for (int i = 0; i < NumberEnums.THOUSAND.getSource(); i++) {
                log.info("w-" + i);
            }
        }, applicationTaskExecutor);
        CompletableFuture<Void> completableFuture3 = CompletableFuture.runAsync(() -> {
            for (int i = 0; i < NumberEnums.THOUSAND.getSource(); i++) {
                log.info("a-" + i);
            }
        }, applicationTaskExecutor);
        CompletableFuture.allOf(completableFuture1, completableFuture2, completableFuture3);
    }

    @Override
    public void threadPool() {
        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(() -> {
            for (int i = 0; i < NumberEnums.THOUSAND.getSource(); i++) {
                log.info("a-" + i);
            }
        }, threadPoolTaskExecutor);
        CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(() -> {
            for (int i = 0; i < NumberEnums.THOUSAND.getSource(); i++) {
                log.info("w-" + i);
            }
        }, threadPoolTaskExecutor);
        CompletableFuture<Void> completableFuture3 = CompletableFuture.runAsync(() -> {
            for (int i = 0; i < NumberEnums.THOUSAND.getSource(); i++) {
                log.info("a-" + i);
            }
        }, threadPoolTaskExecutor);
        redisUtil.set("test","test");
        CompletableFuture.allOf(completableFuture1, completableFuture2, completableFuture3);

    }

    public void                                                        set() {
        redisTemplate.opsForValue().set("key", "value");
        System.out.println(redisTemplate.opsForValue().get("key"));
    }
}
