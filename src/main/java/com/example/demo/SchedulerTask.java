package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {
    private int count=0;
    @Scheduled(cron = "0 0 12 ? * WED")
    private void process(){
        System.out.println("执行次数"+(count++));
    }
}
