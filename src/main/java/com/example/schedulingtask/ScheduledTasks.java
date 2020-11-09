package com.example.schedulingtask;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Slf4j
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron = "0 47 15 * * ?")
    public void reportCurrentTime(){
        log.info("The time is now {}", dateFormat.format(new Date()));
    }

    @Scheduled(fixedDelay = 1000, initialDelay = 3000)
    public void reportLoopCurrentTime(){
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
