package action;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import document.jvpck.json.JsonActionDependencyUnarchive;

public class DependencyUnarchive implements Action {
    private final JsonActionDependencyUnarchive jsonActionDependencyUnarchive;

    public DependencyUnarchive(JsonNode data) throws JsonProcessingException {
        jsonActionDependencyUnarchive = new ObjectMapper().readValue(
                data.toString(), JsonActionDependencyUnarchive.class);
    }

    @Override
    public void doAction() {
        System.out.println(jsonActionDependencyUnarchive.getDependencyName());
    }
}
