package org.revo

import org.revo.Service.SomeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.rest.core.annotation.HandleBeforeSave

@SpringBootApplication
public class SampleMongoApplication implements CommandLineRunner {
    @Autowired
    SomeService someService

    @Override
    @HandleBeforeSave
    public void run(String... args) throws Exception {
        someService.init()
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run SampleMongoApplication.class, args
    }

}
