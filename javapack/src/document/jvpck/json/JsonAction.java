package document.jvpck.json;

import com.fasterxml.jackson.databind.JsonNode;

public class JsonAction {
    private String actionName;
    private JsonNode data;

    public void setActionName(String actionName) { this.actionName = actionName; }
    public String getActionName() { return actionName; }
    public void setData(JsonNode data) { this.data = data; }
    public JsonNode getData() { return data; }
}
