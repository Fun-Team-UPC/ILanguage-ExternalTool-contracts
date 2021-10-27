package contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.LocalDate;

@Value
public class RegisterExternalTool {
    @TargetAggregateIdentifier
    private String externalToolId;
    private String name;
    private String description;
    private String resource;
}
