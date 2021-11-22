package context.component.BaseDirectoriesComponent;

import context.component.ArgumentsComponent.ArgumentsComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class BaseDirectoriesComponentImplementation implements BaseDirectoriesComponent {
    @Autowired
    private ArgumentsComponent argumentsComponent;

    private boolean initialized = false;
    private String launchedFromDirectory;
    private String applicationDirectory;

    public void init() {
        if (initialized) return;
        launchedFromDirectory = new File("").getAbsolutePath() + "/";
        applicationDirectory = launchedFromDirectory + argumentsComponent.getArguments()[0];
        initialized = true;
    }

    @Override
    public String getLaunchedFromDirectory() {
        init();
        return launchedFromDirectory;
    }

    @Override
    public String getApplicationDirectory() {
        init();
        return applicationDirectory;
    }
}
