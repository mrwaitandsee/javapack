package context.repository.BeforeCompilationActionsDAO;

import context.component.DocumentJvpckComponent.DocumentJvpckComponent;
import document.jvpck.json.JsonAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BeforeCompilationActionsDAOImplementation implements BeforeCompilationActionsDAO {
    @Autowired private DocumentJvpckComponent documentJvpckComponent;

    @Override
    public JsonAction[] getAllBeforeCompilationActions() {
        return documentJvpckComponent.read().getBeforeCompilation();
    }
}
