package telv;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter

public class RemoteController implements Remote_Controller {
    private TVHD tv;
    //private Channel cha;
    private int lastChannelIndex = -1;
    private int lastProgramIndex = -1;

    public RemoteController(TVHD tv) {
        //this.cha = cha;
        this.tv = tv;
        this.lastChannelIndex = -1;
        this.lastProgramIndex = -1;
    }

    @Override
    public void setChannel(int number) {
        lastChannelIndex = tv.getCurrentChannelIndex();
        tv.setChannelByNumber(number);
    }

    @Override
    public void nextChannel() {
        lastChannelIndex = tv.getCurrentChannelIndex();
        tv.nextChannel();
    }

    @Override
    public void previousChannel() {
        lastChannelIndex = tv.getCurrentChannelIndex();
        tv.previousChannel();
    }

    @Override
    public void nextProgram() {
        tv.getCurrentChannel().nextProgram();
        lastProgramIndex = tv.getCurrentChannel().getCurrentProgramIndex();
        //cha.nextProgram();
    }

    @Override
    public void previousProgram() {
        tv.getCurrentChannel().previousProgram();
        lastChannelIndex = tv.getCurrentChannel().getCurrentProgramIndex();
        //cha.previousProgram();
    }
}
