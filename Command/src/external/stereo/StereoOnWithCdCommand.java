package external.stereo;

import command.Command;

public class StereoOnWithCdCommand implements Command {
  Stereo stereo;

  public StereoOnWithCdCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void excute() {
    stereo.on();
    stereo.setCd();
    stereo.setVolume(10);
  }

  @Override
  public void undo() {
    stereo.off();
  }

}
