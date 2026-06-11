package com.fairwayops.caddie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@ConfigurationPropertiesScan
@EnableJpaAuditing
@SpringBootApplication
@EntityScan(basePackages = {"com.fairwayops.caddie", "com.fairwayops.common"})
public class CaddieServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CaddieServiceApplication.class, args);
    }
}
