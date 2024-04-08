package external.stereo;

import command.Command;

public class StereoOffWithCdCommand implements Command {
  Stereo stereo;

  public StereoOffWithCdCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void excute() {
    stereo.off();
  }

  @Override
  public void undo() {
    stereo.on();
    stereo.setCd();
    stereo.setVolume(10);
  }

}
