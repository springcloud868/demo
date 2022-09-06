package com.example.melody.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ApplicationService {

    public void startPrint() {
        log.info("启动类被运行加载会调用");
    }
}
