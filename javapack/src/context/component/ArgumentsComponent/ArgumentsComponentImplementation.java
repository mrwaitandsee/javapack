package context.component.ArgumentsComponent;

import org.springframework.stereotype.Component;

@Component
public class ArgumentsComponentImplementation implements ArgumentsComponent {
    private String[] arguments;

    public void setArguments(String[] arguments) { this.arguments = arguments; }

    @Override
    public String[] getArguments() { return arguments; }
}
