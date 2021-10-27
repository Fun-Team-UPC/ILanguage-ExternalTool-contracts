package contracts.events;

import lombok.Value;

import java.time.Instant;
import java.time.LocalDate;

@Value
public class ExternalToolRegistered {
    private String externalToolId;
    private String name;
    private String description;
    private String resource;
    private Instant occurredOn;
}
