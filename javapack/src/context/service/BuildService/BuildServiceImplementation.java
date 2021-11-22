package context.service.BuildService;

import context.component.ArgumentsComponent.ArgumentsComponent;
import context.controller.BeforeController.BeforeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildServiceImplementation implements BuildService {
    @Autowired private ArgumentsComponent argumentsComponent;

    @Autowired private BeforeController beforeBuildController;

    @Override
    public void build() {
        String[] args = argumentsComponent.getArguments();
        switch (args[1]) {
            case "-before":
                beforeBuildController.run();
                break;
            case "-compilation":
                break;
            case "-afterCompilation":
                break;
            case "-after":
                break;
            default:
                break;
        }
    }
}
