package org.revo

import org.revo.service.SomeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
public class SampleMongoApplication implements CommandLineRunner {

    @Autowired
    SomeService service

    @Override
    public void run(String... args) throws Exception {
        service.init()
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleMongoApplication.class, args);
    }

}
