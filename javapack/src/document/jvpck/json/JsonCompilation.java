package document.jvpck.json;

public class JsonCompilation {
    private String sourcecode;
    private String[] classpath;
    private String bytecode;

    public void setSourcecode(String sourcecode) { this.sourcecode = sourcecode; }
    public String getSourcecode() { return sourcecode; }
    public void setClasspath(String[] classpath) { this.classpath = classpath; }
    public String[] getClasspath() { return classpath; }
    public void setBytecode(String bytecode) { this.bytecode = bytecode; }
    public String getBytecode() { return bytecode; }
}
