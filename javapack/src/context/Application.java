package context;

import context.service.BuildService.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Application {
    @Autowired
    private BuildService buildService;

    public void start() {
        buildService.build();
    }
}
