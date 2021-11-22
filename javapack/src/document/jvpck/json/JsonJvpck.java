package document.jvpck.json;

public class JsonJvpck {
    private JsonDependency[] dependencies;
    private JsonCompilation compilation;
    private JsonAction[] beforeCompilation;
    private JsonAction[] afterCompilation;
    private JsonCmd[] cmd;

    public void setDependencies(JsonDependency[] dependencies) { this.dependencies = dependencies; }
    public JsonDependency[] getDependencies() { return dependencies; }
    public void setCompilation(JsonCompilation compilation) { this.compilation = compilation; }
    public JsonCompilation getCompilation() { return compilation; }
    public void setBeforeCompilation(JsonAction[] beforeCompilation) { this.beforeCompilation = beforeCompilation; }
    public JsonAction[] getBeforeCompilation() { return beforeCompilation; }
    public void setAfterCompilation(JsonAction[] afterCompilation) { this.afterCompilation = afterCompilation; }
    public JsonAction[] getAfterCompilation() { return afterCompilation; }
    public void setCmd(JsonCmd[] cmd) { this.cmd = cmd; }
    public JsonCmd[] getCmd() { return cmd; }
}
