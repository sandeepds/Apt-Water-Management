package model.commands;

public class AddGuests extends Command{
    public static final String CMD = "ADD_GUESTS";
    public AddGuests(String command) {
        super(CMD);
        setParams(command);
    }

    @Override
    public void setParams(String command) {
        this.params = command.split(" ");
    }

    @Override
    public String[] getParams() {
        return this.params;
    }
}
