package Reflection.BarracksWars.contracts;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
