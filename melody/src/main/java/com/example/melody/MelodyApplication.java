package com.example.melody;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author 86176
 */
@EnableAsync
@Slf4j
@SpringBootApplication(scanBasePackages = "com.example.melody.*")
@ComponentScan(basePackages = "com.example.melody.*")
public class MelodyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MelodyApplication.class, args);
        log.info("---------启动成功！！！！！！！！！！---------");
    }

}
