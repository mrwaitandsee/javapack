package action;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import document.jvpck.json.JsonActionDependencyCopy;

public class DependencyCopy implements Action {
    private final JsonActionDependencyCopy jsonActionDependencyCopy;

    public DependencyCopy(JsonNode data) throws JsonProcessingException {
        jsonActionDependencyCopy = new ObjectMapper().readValue(
                data.toString(), JsonActionDependencyCopy.class);
    }

    @Override
    public void doAction() {
        System.out.println(jsonActionDependencyCopy.getDependencyName());
    }
}
