package com.example.melody.config;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;

/**
 * @author 86176
 *
 */
@Slf4j
@Configuration
public class CustomThreadPoolConfig {

    @Value("${spring.task.execution.pool.core-size}")
    private int corePoolSize;
    @Value("${spring.task.execution.pool.max-size}")
    private int maxPoolSize;
    @Value("${spring.task.execution.pool.queue-capacity}")
    private int queueCapacity;
    @Value("${spring.task.execution.thread-name-prefix}")
    private String namePrefix;
    @Value("${spring.task.execution.pool.keep-alive}")
    private int keepAliveTime;

    /**
     * 机遇 ExecutorService 自定义线程池（java 5引入的）
     * @return ExecutorService
     */
    @Bean
    public ExecutorService callbackThreadPool() {

        ThreadFactory threadFactory = new ThreadFactoryBuilder()
                .setUncaughtExceptionHandler((t, e) -> log.error(t.getName() + " execute error:", e))
                .setNameFormat("callback-pool-%d").build();
        return new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1000), threadFactory, new ThreadPoolExecutor.CallerRunsPolicy());
    }


    /**
     * 自定义 ThreadPoolTaskExecutor 线程池
     * @return ThreadPoolTaskExecutor
     */
    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor poolTaskExecutor = new ThreadPoolTaskExecutor();
        // 此方法返回可用处理器的虚拟机的最大数量; 不小于1
        int corePoolSize = Runtime.getRuntime().availableProcessors();
        // 设置核心线程数
        poolTaskExecutor.setCorePoolSize(corePoolSize);
        // 设置最大线程数
        poolTaskExecutor.setMaxPoolSize(corePoolSize * 2 + 1);
        // 除核心线程外的线程存活时间
        poolTaskExecutor.setKeepAliveSeconds(keepAliveTime);
        // 如果传入值大于0，底层队列使用的是LinkedBlockingQueue,否则默认使用SynchronousQueue
        poolTaskExecutor.setQueueCapacity(queueCapacity);
        // 线程名称前缀
        poolTaskExecutor.setThreadNamePrefix(namePrefix);
        // 设置拒绝策略
        poolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        poolTaskExecutor.initialize();
        return poolTaskExecutor;
    }
}
