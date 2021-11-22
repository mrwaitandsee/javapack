package action;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ActionConfiguration {
    @Bean(name = "folder.copy")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public FolderCopy getFolderCopy(JsonNode data) throws JsonProcessingException {
        return new FolderCopy(data);
    }

    @Bean(name = "folder.create")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public FolderCreate getFolderCreate(JsonNode data) throws JsonProcessingException {
        return new FolderCreate(data);
    }

    @Bean(name = "folder.delete")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public FolderDelete getFolderDelete(JsonNode data) throws JsonProcessingException {
        return new FolderDelete(data);
    }

    @Bean(name = "dependency.copy")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DependencyCopy getDependencyCopy(JsonNode data) throws JsonProcessingException {
        return new DependencyCopy(data);
    }

    @Bean(name = "dependency.unarchive")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DependencyUnarchive getDependencyUnarchive(JsonNode data) throws JsonProcessingException {
        return new DependencyUnarchive(data);
    }
}
