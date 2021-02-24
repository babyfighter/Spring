package com.adam.service;


import org.springframework.scheduling.annotation.Scheduled;

public class ScheduleService {
        @Scheduled(cron = "* * * * * ?")
        public void hello(){
            System.out.println("hello,Executing");
        }
}
