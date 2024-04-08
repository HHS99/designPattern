package remote;

import command.Command;

public class SimpleRemoteControl {
  Command slot;
  public void setCommand(Command command) {
      slot = command;
  }

  public void buttonWasPressed() {
      slot.excute();
  }
}
