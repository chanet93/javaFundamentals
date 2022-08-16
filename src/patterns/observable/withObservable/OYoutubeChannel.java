package patterns.observable.withObservable;

import java.util.Observable;

public class OYoutubeChannel extends Observable {
    private String video;

    public void addNewVideo(String video){
        this.video = video;
        setChanged();
        notifyObservers(video);
    }

}
