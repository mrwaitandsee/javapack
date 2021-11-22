package context.repository.DependenciesDAO;

import context.component.DocumentJvpckComponent.DocumentJvpckComponent;
import document.jvpck.json.JsonDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public class DependenciesDAOImplementation implements DependenciesDAO {
    @Autowired private DocumentJvpckComponent documentJvpckComponent;

    @Override
    public JsonDependency[] getAllDependencies() { return documentJvpckComponent.read().getDependencies(); }

    @Override
    public JsonDependency getDependencyByName(String name) {
        return Arrays.stream(documentJvpckComponent.read().getDependencies()).filter(
                dependency->dependency.getName().equals(name)).findFirst().get();
    }
}
