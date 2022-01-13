package in.dypc;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import java.util.*;


public class EventHubTriggerFunction {
    /**
     * This function will be invoked when an event is received from Event Hub.
     */
    @FunctionName("EventHubTrigger-Java")
    public void run(
        @EventHubTrigger(name = "message",
            eventHubName = "andy-event-hubs",
            connection = "EventHubConnectionString",
            consumerGroup = "$Default",
            dataType = "string"
            ) String message,
        final ExecutionContext context
    ) {
        context.getLogger().info("Java Event Hub trigger function executed.");
        context.getLogger().info("Message:" + message);
    }
}
