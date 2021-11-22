import context.Application;
import context.component.ArgumentsComponent.ArgumentsComponentImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("context");

        ArgumentsComponentImplementation argumentsComponent = context.getBean(ArgumentsComponentImplementation.class);
        argumentsComponent.setArguments(args);

        context.getBean(Application.class).start();
    }
}
