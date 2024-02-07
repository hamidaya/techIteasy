package org.ayachi.techiteasy.exceptions;


// Deze hele klasse is standaard code die gegenereerd wordt bij het aanmaken van een nieuw Spring Boot project.
// Deze klasse is, net als in "plain java", de voordeur van je applicatie. Hier starten we de applicatie.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Deze annotatie zorgt er voor dat Spring Boot alle configuraties klaar zet en eventuele custom configuraties inleest.
// Ook de @RestController en @ControllerAdvice worden dankzij deze annotatie ingelezen.
@SpringBootApplication
public class TechItEasyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechItEasyApplication.class, args);
    }

}