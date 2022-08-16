package patterns.observable;

import java.util.*;

public class YoutubeChannel {
    private Map<String,String> video = new HashMap<String,String>();

    private List<Subscriptor> subscriptors = new ArrayList<Subscriptor>();

    public void addObserver(Subscriptor subscriptor){
        this.subscriptors.add(subscriptor);
    }
    public void removeObserver(Subscriptor subscriptor){
        this.subscriptors.remove(subscriptor);
    }

    public void setVideo(Map<String,String> video){
        this.video=video;
        for (Subscriptor s: subscriptors) {
            s.update(this.video);
            String s1 = video.toString();
            System.out.println("Notification: "+s1.substring(0,30)+" Title: "+s1.substring(32));
        }
    }

}
