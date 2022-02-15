package model.commands;

public abstract class Command {
	String command;
    String[] params;

    public Command(String command) {
        this.command = command;
    }
    public abstract void setParams(String command);
    public abstract String[] getParams();

}
