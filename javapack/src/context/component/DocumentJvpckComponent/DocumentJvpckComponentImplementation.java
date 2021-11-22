package context.component.DocumentJvpckComponent;

import com.fasterxml.jackson.databind.ObjectMapper;
import context.component.BaseDirectoriesComponent.BaseDirectoriesComponent;
import document.jvpck.json.JsonJvpck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class DocumentJvpckComponentImplementation implements DocumentJvpckComponent {
    @Autowired
    private BaseDirectoriesComponent baseDirectoriesComponent;

    @Override
    public JsonJvpck read() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(
                    new File(baseDirectoriesComponent.getLaunchedFromDirectory() + "./jvpck.json"),
                    JsonJvpck.class
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
