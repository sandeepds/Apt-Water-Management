package model.commands;

public class AllotWaterCommand extends Command{

	public static final String CMD = "ALLOT_WATER";

    public AllotWaterCommand(String command) {
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
