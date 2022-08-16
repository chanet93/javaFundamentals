import allaboutstatic.StaticFieldCar;
import encapsulation.Batery;
import encapsulation.Phone;
import encapsulation.Tablet;
import interfacesvsabstract.HumanBeing;
import interfacesvsabstract.InterfaceExample;
import interfacesvsabstract.Woman;
import patterns.observable.withObservable.OSubscriptor;
import patterns.observable.withObservable.OYoutubeChannel;
import patterns.observable.Subscriptor;
import patterns.observable.YoutubeChannel;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StaticFieldCar toyota = new StaticFieldCar("toyota","v8");
        StaticFieldCar ferrari = new StaticFieldCar("ferrari","w16");
        System.out.printf(""+StaticFieldCar.numberOfCars);

        //Observer Pattern
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        Subscriptor subscriptor = new Subscriptor();

        youtubeChannel.addObserver(subscriptor);
        Map<String,String> video = new HashMap<>();
        video.put(" Add a new video to channel :)"," Dreams became true ");
        youtubeChannel.setVideo(video);

        youtubeChannel.removeObserver(subscriptor);
        Map<String,String> video1 = new HashMap<>();
        video1.put(" Add a new video to channel :)"," The absolute woman");
        youtubeChannel.setVideo(video1);

        youtubeChannel.addObserver(subscriptor);
        Map<String,String> video3 = new HashMap<>();
        video3.put(" Add a new video to channel :)"," Patient and stronger");
        youtubeChannel.setVideo(video3);

        OYoutubeChannel oYoutubeChannel = new OYoutubeChannel();
        OSubscriptor oSubscriptor= new OSubscriptor();
        oYoutubeChannel.addObserver(oSubscriptor);
        oYoutubeChannel.addNewVideo("video");
        oYoutubeChannel.deleteObserver(oSubscriptor);
        oYoutubeChannel.addNewVideo("video2");

        //Encapsulationn
        Tablet tablet = new Tablet("IMac",30001);
        Phone phone= new Phone("Iphone", 300);
        phone.setCapacity(300004);
        System.out.println(phone.duracionBateria());
        System.out.println(tablet.duracionBateria());

        HumanBeing humanBeing = new Woman();
        humanBeing.getYear();

        InterfaceExample interfaceExample = new Woman();

    }
}