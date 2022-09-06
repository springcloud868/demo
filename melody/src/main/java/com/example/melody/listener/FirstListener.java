package com.example.melody.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@Slf4j
@WebListener
public class FirstListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("First 监听器初始化....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.info("First 监听器销毁......");
    }

}
