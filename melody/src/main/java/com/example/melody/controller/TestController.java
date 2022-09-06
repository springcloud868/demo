package com.example.melody.controller;

import com.example.melody.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.CompletableFuture;

/**
 * @author 86176
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;


    @RequestMapping(value = "/load", method = RequestMethod.POST)
    public CompletableFuture<String> contextLoads() throws InterruptedException {
        return testService.hello("async注解创建");
    }

    @RequestMapping("/pool")
    public String testThreadPool() {
        testService.testThreadPool();
        return "success";
    }

    @GetMapping("/thread")
    public void testThread() {
        testService.testThread();
    }

    @GetMapping("/thread-pool")
    public void threadPool() {
        testService.threadPool();
    }

}
