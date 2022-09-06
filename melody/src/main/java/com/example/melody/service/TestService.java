package com.example.melody.service;

import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.CompletableFuture;

/**
 * @author 86176
 */

public interface TestService {

    /**
     * 测试
     *
     * @param name 参数
     * @return CompletableFuture<String>
     */
    @Async
    CompletableFuture<String> hello(String name) throws InterruptedException;

    void testThreadPool();

    void testThread();

    void threadPool();
}
