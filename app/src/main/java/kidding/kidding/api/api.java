package kidding.kidding.api;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import kidding.kidding.Eventfilter;
import kidding.kidding.R;
import kidding.kidding.api.Event;

public class api {
        private List<Event> mEventList;
        private Set<Integer> mFilter;
        public List<Event> filtedList;

        public api(){
            mEventList=new ArrayList<Event>();
        }
        public List<Event> getEvents(){

            mEventList.add(new Event(" Viva La Comida! Bilingual Cooking and Culture Class with Marinette Tovar"      , Eventfilter.TYPE_STORY,1423434355156L,30,2,10,"Come and create meals with a focus on learning and culture for young children. Marinette Tovar shares stories from her culinary upbringing in Mexico while teaching about the traditional foods and culture in Latin cooking. Kids will get to create, get messy with tasty meals such as guacamole, salsas, enchiladas and more. Please register in advance to help us ensure we have enough delicious food for everyone that comes (limit 12 children per class so register early!)", R.drawable.aa1));
            mEventList.add(new Event("basket ball"     , Eventfilter.TYPE_SPORT,1424353355516L,60,5,20,"welcome to the basket ball",R.drawable.b1));
            mEventList.add(new Event("Meseum"          , Eventfilter.TYPE_SCI,1423478355516L,70,2,20,"welcome to the Museum",R.drawable.sport1));
            mEventList.add(new Event("House party"     , Eventfilter.TYPE_ENTERTAIN,1423437235556L,80,6,15,"welcome to the House",R.drawable.museum1));
            mEventList.add(new Event("Park gathering"  , Eventfilter.TYPE_ART,1423434775546L,90,8,12,"welcome to the park",R.drawable.museum1));
            mEventList.add(new Event("friends hang out", Eventfilter.TYPE_CULTURE,1423432451156L,20,3,18,"welcome to the friends place",R.drawable.art1));
            mEventList.add(new Event("friends hang out1", Eventfilter.TYPE_CULTURE,1423432451156L,20,3,18,"welcome to the friends place",R.drawable.party1));
            mEventList.add(new Event("friends hang out2", Eventfilter.TYPE_CULTURE,1423432451156L,20,3,18,"welcome to the friends place",R.drawable.picnic1));
            mEventList.add(new Event("friends hang out3", Eventfilter.TYPE_CULTURE,1423432451156L,20,3,18,"welcome to the friends place",R.drawable.music1));
            mEventList.add(new Event("friends hang out4", Eventfilter.TYPE_CULTURE,1423432451156L,20,3,18,"welcome to the friends place",R.drawable.aa1));


            return mEventList;
        }

        public void applyFilter(){

        }
        public Set<Integer> getFilterSet(){
            return mFilter;
        }

        public void AddFilter(int input){
            mFilter.add(input);
        }

        public void removeFilter(int input){
            mFilter.remove(input);
        }

    public boolean checkFilter(int input){
        return mFilter.contains(input);
    }

}