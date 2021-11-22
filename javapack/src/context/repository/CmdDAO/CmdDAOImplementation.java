package context.repository.CmdDAO;

import context.component.DocumentJvpckComponent.DocumentJvpckComponent;
import document.jvpck.json.JsonCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CmdDAOImplementation implements CmdDAO {
    @Autowired private DocumentJvpckComponent documentJvpckComponent;

    @Override
    public JsonCmd[] getAllCmd() { return documentJvpckComponent.read().getCmd(); }
}
