package ru.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Random;

@Component
public class CustomHealthIndicator implements HealthIndicator {
    private final Random randomizer = new Random();
    private final List<Integer> statusCode = List.of(200,204,401,404,503);

    @Override
    public Health health() {
        int randomStatusCode = statusCode.get(randomizer.nextInt(statusCode.size()));

        return (switch (randomStatusCode) {
            case 200,204 -> Health.status("OK");
            case 404 -> Health.status("NOTOK");
            default -> Health.status("UNKNOWN");
    }).build();
    }
}
