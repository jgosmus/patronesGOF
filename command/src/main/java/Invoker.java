import java.util.ArrayList;
import java.util.List;

public class Invoker {
    List<Command> commandList;

    public Invoker() {
        this.commandList = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void execute() {
        this.commandList.forEach(Command::execute);
    }
}
