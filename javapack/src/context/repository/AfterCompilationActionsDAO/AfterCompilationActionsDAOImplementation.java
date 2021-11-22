package context.repository.AfterCompilationActionsDAO;

import context.component.DocumentJvpckComponent.DocumentJvpckComponent;
import document.jvpck.json.JsonAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AfterCompilationActionsDAOImplementation implements AfterCompilationActionsDAO {
    @Autowired private DocumentJvpckComponent documentJvpckComponent;

    @Override
    public JsonAction[] getAllAfterCompilationActions() { return documentJvpckComponent.read().getAfterCompilation(); }
}
