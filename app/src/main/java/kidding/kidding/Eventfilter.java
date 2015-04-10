package kidding.kidding;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import kidding.kidding.api.api;

import java.util.Set;

/**
 * Created by ChiYo Hsiao on 3/17/2015.
 */
public class Eventfilter extends Activity {
    private static final String TAG ="Filter" ;
    public Set<Integer> filterSet;

    public static final int TIME_BASE=0;
    public static final int TIME_WEEKEND =TIME_BASE+1;
    public static final int TIME_WEEKDAY =TIME_BASE+2;
    public static final int TIME_AFTER5  =TIME_BASE+3;

    public static final int TYPE_BASE=100;
    public static final int TYPE_STORY = TYPE_BASE+1;
    public static final int TYPE_ART = TYPE_BASE+2;
    public static final int TYPE_SCI = TYPE_BASE+3;
    public static final int TYPE_ENTERTAIN = TYPE_BASE+4;
    public static final int TYPE_CULTURE = TYPE_BASE+5;
    public static final int TYPE_SPORT = TYPE_BASE+6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filter);
        Log.i(TAG, "onCrete");
        final api mApi=new api();
        final Button btApplyFilter= (Button) findViewById(R.id.bt_apply);
        btApplyFilter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        final Button btTimeWeekEnd= (Button) findViewById(R.id.bt_time_weekend);
        btTimeWeekEnd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mApi.checkFilter(TIME_WEEKEND))
                    mApi.removeFilter(TIME_WEEKEND);
                else
                    mApi.AddFilter(TIME_WEEKEND);
            }
        });

        final Button btTimeWeekDay= (Button) findViewById(R.id.bt_time_weekday);
        btTimeWeekDay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mApi.checkFilter(TIME_WEEKDAY))
                    mApi.removeFilter(TIME_WEEKDAY);
                else
                    mApi.AddFilter(TIME_WEEKDAY);
            }
        });

        final Button btTimeAfter5= (Button) findViewById(R.id.bt_time_after5);
        btTimeAfter5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mApi.checkFilter(TIME_AFTER5))
                    mApi.removeFilter(TIME_AFTER5);
                else
                    mApi.AddFilter(TIME_AFTER5);
            }
        });

        final Button btTypeStory= (Button) findViewById(R.id.bt_type_story);
        btTypeStory.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mApi.checkFilter(TYPE_STORY))
                    mApi.removeFilter(TYPE_STORY);
                else
                    mApi.AddFilter(TYPE_STORY);
            }
        });

        final Button btTypeArt= (Button) findViewById(R.id.bt_type_art);
        btTypeArt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mApi.checkFilter(TYPE_ART))
                    mApi.removeFilter(TYPE_ART);
                else
                    mApi.AddFilter(TYPE_ART);
            }
        });

        final Button btTypeSci= (Button) findViewById(R.id.bt_type_science);
        btTypeSci.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mApi.checkFilter(TYPE_SCI))
                    mApi.removeFilter(TYPE_SCI);
                else
                    mApi.AddFilter(TYPE_SCI);
            }
        });

        final Button btTypeEntertain= (Button) findViewById(R.id.bt_type_entertain);
        btTypeEntertain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mApi.checkFilter(TYPE_ENTERTAIN))
                    mApi.removeFilter(TYPE_ENTERTAIN);
                else
                    mApi.AddFilter(TYPE_ENTERTAIN);
            }
        });

        final Button btTypeCulture= (Button) findViewById(R.id.bt_type_culture);
        btTypeCulture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mApi.checkFilter(TYPE_CULTURE))
                    mApi.removeFilter(TYPE_CULTURE);
                else
                    mApi.AddFilter(TYPE_CULTURE);
            }
        });

        final Button btTypeSport= (Button) findViewById(R.id.bt_type_sport);
        btTypeSport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mApi.checkFilter(TYPE_SPORT))
                    mApi.removeFilter(TYPE_SPORT);
                else
                    mApi.AddFilter(TYPE_SPORT);
            }
        });

    }




}
