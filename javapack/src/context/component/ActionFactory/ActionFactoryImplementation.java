package context.component.ActionFactory;

import action.Action;
import action.ActionConfiguration;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ActionFactoryImplementation implements ActionFactory {
    private final ApplicationContext context;

    private ActionFactoryImplementation() {
        context = new AnnotationConfigApplicationContext(ActionConfiguration.class);
    }

    @Override
    public Action getAction(String actionName, JsonNode data) {
        return (Action) context.getBean(actionName, data);
    }
}
