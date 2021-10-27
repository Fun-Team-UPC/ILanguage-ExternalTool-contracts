package contracts.events;

import lombok.Value;

import java.time.Instant;
import java.time.LocalDate;

@Value
public class ExternalToolEdited {
    private String externalToolId;
    private String name;
    private String description;
    private String resource;
    Instant occurredOn;
}
