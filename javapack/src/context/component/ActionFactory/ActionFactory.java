package context.component.ActionFactory;

import action.Action;
import com.fasterxml.jackson.databind.JsonNode;

public interface ActionFactory {
    Action getAction(String actionName, JsonNode data);
}
