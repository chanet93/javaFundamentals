package patterns.observable;

import java.util.Map;

public class Subscriptor implements ISubscriptor{
    private Map<String,String> video;
    @Override
    public void update(Object o){
        this.video = (Map<String, String>) o;
    }
}
