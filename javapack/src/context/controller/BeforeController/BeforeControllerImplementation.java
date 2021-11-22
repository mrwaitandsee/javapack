package context.controller.BeforeController;

import action.Action;
import context.component.ActionFactory.ActionFactory;
import context.repository.BeforeCompilationActionsDAO.BeforeCompilationActionsDAO;
import document.jvpck.json.JsonAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BeforeControllerImplementation implements BeforeController {
    @Autowired private BeforeCompilationActionsDAO beforeCompilationActionsDAO;
    @Autowired private ActionFactory actionFactory;

    @Override
    public void run() {
        JsonAction[] jsonActions = beforeCompilationActionsDAO.getAllBeforeCompilationActions();
        Action[] actions = new Action[jsonActions.length];

        for (int i = 0; i < jsonActions.length; i += 1) {
            actions[i] = actionFactory.getAction(
                    jsonActions[i].getActionName(), jsonActions[i].getData());
        }

        for (Action action : actions) action.doAction();
    }
}
