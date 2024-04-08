package remote;

import command.Command;
import command.NoCommand;

public class RemoteControl {
  final int SLOT_COUNT = 7;
  Command[] onCommands = new Command[SLOT_COUNT];
  Command[] offCommands = new Command[SLOT_COUNT];
  Command undoCommand;

  public RemoteControl() {
    Command noCommand = new NoCommand();
    for (int i = 0; i < SLOT_COUNT; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }

  public void setCommand(int slot, Command onCommnad, Command offCommand) {
    onCommands[slot] = onCommnad;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    onCommands[slot].excute();
    undoCommand = onCommands[slot];
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].excute();
    undoCommand = offCommands[slot];
  }

  public void undoButtonWasPushed() {
    undoCommand.undo();
  }

  @Override
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("----------remote control----------");
    for (int i = 0; i < SLOT_COUNT; i++) {
      stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
    }
    return stringBuffer.toString();
  }

  
}
