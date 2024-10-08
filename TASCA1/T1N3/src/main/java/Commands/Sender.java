package Commands;

import java.util.ArrayList;

public class Sender {
    private static ArrayList<Command> commands;

    public Sender() {
        commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    public void executeCommands(){
        commands.forEach(Command::execute);
    }

}
