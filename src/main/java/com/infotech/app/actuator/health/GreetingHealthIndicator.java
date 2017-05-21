package com.infotech.app.actuator.health;

import java.util.Collection;

import com.infotech.app.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import com.infotech.app.model.Greeting;

/**
 * The GreetingHealthIndicator is an example implementation of a Spring Boot
 * Actuator HealthIndicator. When Actuator's Health Endpoint is invoked, it
 * polls all HealthIndicator implementations to ascertain an aggregate status of
 * the application's health status.
 * 
 * @author MohammadReza Alagheband
 *
 */
@Component
public class GreetingHealthIndicator implements HealthIndicator {

    /**
     * The GreetingService business service.
     */
    @Autowired
    private transient GreetingService greetingService;

    @Override
    public Health health() {
        final Collection<Greeting> greetings = greetingService.findAll();

        if (greetings == null || greetings.isEmpty()) {
            return Health.down().withDetail("count", 0).build();
        }

        return Health.up().withDetail("count", greetings.size()).build();
    }

}
