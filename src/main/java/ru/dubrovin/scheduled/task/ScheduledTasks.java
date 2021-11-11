package ru.dubrovin.scheduled.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRateString ="${scheduled.fetchMetricsTaskOne}")
    public void taskOne() {
        System.out.println("Первая запущена  " + dateFormat.format(new Date()));
    }

    @Scheduled(fixedRateString ="${scheduled.fetchMetricsTaskTwo}")
    public void taskTwo() {
        System.out.println("Вторая запущена " + dateFormat.format(new Date()));
    }
}
