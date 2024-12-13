package telv;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor

public class TVHD {
    private List<Channel> channels;
    private int currentChannelIndex = 0;

    public TVHD(List<Channel> channels) {
        this.channels = channels;
        this.currentChannelIndex = 0;
    }


    public Channel getCurrentChannel() {
        return channels.get(currentChannelIndex);
    }
    public int getCurrentChannelIndex(){
        return currentChannelIndex;
    }

    public void setChannelByNumber(int number) {
        if (number >= 1 && number <= channels.size()) {
            currentChannelIndex = number - 1;
        } else {
            System.out.println("Неправильный номер");
        }
    }

    public void nextChannel() {
        currentChannelIndex = (currentChannelIndex + 1) % channels.size();
    }

    public void previousChannel() {
        currentChannelIndex = (currentChannelIndex - 1 + channels.size()) % channels.size();
    }

}
