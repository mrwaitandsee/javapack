package action;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import document.jvpck.json.JsonActionFolderCreate;

public class FolderCreate implements Action {
    private final JsonActionFolderCreate jsonActionFolderCreate;

    public FolderCreate(JsonNode data) throws JsonProcessingException {
        jsonActionFolderCreate = new ObjectMapper().readValue(
                data.toString(), JsonActionFolderCreate.class);
    }

    @Override
    public void doAction() {
        System.out.println(jsonActionFolderCreate.getPath());
    }
}
