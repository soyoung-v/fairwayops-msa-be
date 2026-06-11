package com.fairwayops.golfcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@ConfigurationPropertiesScan
@EnableJpaAuditing
@SpringBootApplication
@EntityScan(basePackages = {"com.fairwayops.golfcourse", "com.fairwayops.common"})
public class GolfCourseServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GolfCourseServiceApplication.class, args);
    }
}
