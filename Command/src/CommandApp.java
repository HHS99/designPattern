import external.light.Light;
import external.light.LightOffCommand;
import external.light.LightOnCommand;
import external.stereo.Stereo;
import external.stereo.StereoOffWithCdCommand;
import external.stereo.StereoOnWithCdCommand;
import remote.RemoteControl;

public class CommandApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        RemoteControl remote = new RemoteControl();
        Light livingRoomlight = new Light("living room");
        LightOnCommand livingLightOn = new LightOnCommand(livingRoomlight);
        LightOffCommand livingLightOff = new LightOffCommand(livingRoomlight);

        Light bedRoomlight = new Light("bed room");
        LightOnCommand bedLightOn = new LightOnCommand(bedRoomlight);
        LightOffCommand bedLightOff = new LightOffCommand(bedRoomlight);

        Stereo stereo = new Stereo();
        StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
        StereoOffWithCdCommand stereoOffWithCd = new StereoOffWithCdCommand(stereo);

        remote.setCommand(0, livingLightOn, livingLightOff);
        remote.setCommand(1, bedLightOn, bedLightOff);
        remote.setCommand(2, stereoOnWithCd, stereoOffWithCd);

        System.out.println(remote);
        
        remote.onButtonWasPushed(0);
        remote.undoButtonWasPushed();
        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
    }
}
