package action;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import document.jvpck.json.JsonActionFolderCopy;

public class FolderCopy implements Action {
    private final JsonActionFolderCopy jsonActionFolderCopy;

    public FolderCopy(JsonNode data) throws JsonProcessingException {
        jsonActionFolderCopy = new ObjectMapper().readValue(
                data.toString(), JsonActionFolderCopy.class);
    }

    @Override
    public void doAction() {
        System.out.println(jsonActionFolderCopy.getFrom());
    }
}
