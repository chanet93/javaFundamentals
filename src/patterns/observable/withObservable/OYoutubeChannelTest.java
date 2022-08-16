package patterns.observable.withObservable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OYoutubeChannelTest {

    @Test
    public void whenChangingNewsAgencyState_thenNewsChannelNotified() {

        OYoutubeChannel observable = new OYoutubeChannel();
        OSubscriptor observer = new OSubscriptor();

        observable.addObserver(observer);
        observable.addNewVideo("video1");
        assertEquals(observer.getVideo(), "video1");

        observable.deleteObserver(observer);
        observable.addNewVideo("video2");
        assertEquals(observer.getVideo(), "video1");

        observable.addObserver(observer);
        observable.addNewVideo("video3");
        assertEquals(observer.getVideo(), "video3");
    }

}