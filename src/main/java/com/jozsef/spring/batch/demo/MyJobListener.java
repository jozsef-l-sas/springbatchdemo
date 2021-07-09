package com.jozsef.spring.batch.demo;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {

    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Job '" + jobExecution.getJobId() + "' started");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Job ended with status: " + jobExecution.getStatus().toString());
    }

}
