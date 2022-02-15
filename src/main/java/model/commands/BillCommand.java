package model.commands;

public class BillCommand extends Command{
	public static final String CMD = "BILL";
    public BillCommand(String command) {
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
