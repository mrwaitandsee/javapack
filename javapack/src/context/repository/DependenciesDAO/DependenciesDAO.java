package context.repository.DependenciesDAO;

import document.jvpck.json.JsonDependency;

public interface DependenciesDAO {
    JsonDependency[] getAllDependencies();
    JsonDependency getDependencyByName(String name);
}
