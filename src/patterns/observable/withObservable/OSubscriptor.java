package patterns.observable.withObservable;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class OSubscriptor implements Observer {
    private String video;

    @Override
    public void update(Observable o, Object video) {
        this.video= (String) video;
    }

    public String getVideo(){
        return video;
    }
}
