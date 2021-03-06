package com.infotech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Spring Boot main application class.
 * 
 * @author MohammadReza Alagheband
 */

@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@EnableScheduling
@EnableAsync
public class Application {

    /**
     * The name of the Cache for Greeting entities.
     */
    public static final String CACHE_GREETINGS = "greetings";

    /**
     * Entry point for the application.
     * 
     * @param args Command line arguments.
     */

    public static void main(final String... args) {
        SpringApplication.run(Application.class, args);
    }

}
