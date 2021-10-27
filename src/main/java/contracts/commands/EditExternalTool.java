package contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class EditExternalTool {
    @TargetAggregateIdentifier
    private String externalToolId;
    private String name;
    private String description;
    private String resource;
}
