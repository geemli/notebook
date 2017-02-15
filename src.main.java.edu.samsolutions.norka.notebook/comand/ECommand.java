package comand;

/**
 * Created by dznor on 15.02.2017.
 */
public enum ECommand {
    CREATE("add"),
    READ("read"),
    UPDATE("update"),
    DELETE("delete"),
    FIND("find")
    ;

    private final String command;

    ECommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "ECommand{" +
                "command='" + command + '\'' +
                '}';
    }
}
