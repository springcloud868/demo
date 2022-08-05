package com.example.melody.service.impl;

import com.example.melody.config.DifThreadPoolConfig;
import com.example.melody.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

/**
 * @author 86176
 */
@Slf4j
@Service
public class AsyncServiceImpl implements AsyncService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    DifThreadPoolConfig difThreadPoolConfig;


    @Override
    public CompletableFuture<String> hello (String name) throws InterruptedException {
        logger.info("异步线程启动started." + name);
        Executor executor = difThreadPoolConfig.taskExecutor();
        executor.execute(
                () -> logger.info("21111111111")
        );
        Thread.sleep(1000);
        return CompletableFuture.completedFuture("threadPoolTaskExecutor 创建线程");
    }
}
