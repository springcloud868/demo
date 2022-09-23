package com.example.melody;

import com.example.melody.service.ApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.annotation.Resource;

/**
 * @author zyh
 */
@EnableAsync
@Slf4j
@SpringBootApplication(scanBasePackages = "com.example.melody.*")
@ComponentScan(basePackages = "com.example.melody.*")
@ServletComponentScan
public class MelodyApplication implements ApplicationRunner, CommandLineRunner {

    @Resource
    private ApplicationService applicationService;

    public static void main(String[] args) {
        SpringApplication.run(MelodyApplication.class, args);
        log.info("===============melody 启动成功！=================");
    }


    @Override
    public void run(ApplicationArguments args) {

        //在SpringBoot启动类启动时会被调用
        applicationService.startPrint();
        log.info("我是第一种方式,实现ApplicationRunner接口 重写它的run方法");
    }

    @Override
    public void run(String... args) {
        //在SpringBoot启动类启动时会被调用
        applicationService.startPrint();
        log.info("我是第二种方式,实现CommandLineRunner接口 重写它的run方法");
    }
}
