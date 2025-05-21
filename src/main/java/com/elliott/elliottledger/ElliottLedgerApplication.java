package com.elliott.elliottledger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(
        exclude = SecurityAutoConfiguration.class
)
public class ElliottLedgerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElliottLedgerApplication.class, args);
    }

}
