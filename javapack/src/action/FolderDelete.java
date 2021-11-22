package action;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import document.jvpck.json.JsonActionFolderDelete;

public class FolderDelete implements Action {
    private final JsonActionFolderDelete jsonActionFolderDelete;

    public FolderDelete(JsonNode data) throws JsonProcessingException {
        jsonActionFolderDelete = new ObjectMapper().readValue(
                data.toString(), JsonActionFolderDelete.class);
    }

    @Override
    public void doAction() {
        System.out.println(jsonActionFolderDelete.getPath());
    }
}
