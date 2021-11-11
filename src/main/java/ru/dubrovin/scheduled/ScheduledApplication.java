package ru.dubrovin.scheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.dubrovin.scheduled.task.ScheduledTasks;

@SpringBootApplication
public class ScheduledApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduledTasks.class, args);
	}

}
