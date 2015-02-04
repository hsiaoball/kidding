package kidding.kidding.api;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import kidding.kidding.api.Event;

public class api{

        public List<Event> getEvents(){
            List<Event> eventList=new ArrayList<Event>();
            eventList.add(new Event("Story tell"      ,new Date(1423434355156L),30,"welcome to the party"));
            eventList.add(new Event("basket ball"     ,new Date(1424353355516L),60,"welcome to the basket ball"));
            eventList.add(new Event("Meseum"          ,new Date(1423478355516L),70,"welcome to the Museum"));
            eventList.add(new Event("House party"     ,new Date(1423437235556L),80,"welcome to the House"));
            eventList.add(new Event("Park gathering"  ,new Date(1423434775546L),90,"welcome to the park"));
            eventList.add(new Event("friends hang out",new Date(1423432451156L),20,"welcome to the friends place"));
            return eventList;
        }
}