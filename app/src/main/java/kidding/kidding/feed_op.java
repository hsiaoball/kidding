package kidding.kidding;

import android.content.Intent;
import android.os.Bundle;
import android.app.ListActivity;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import kidding.kidding.api.api;
import kidding.kidding.api.Event;

/**
 * Created by Vicky on 3/10/15.
 */
public class feed_op extends ListActivity {
    private static final String TAG = "feed_op";
    private ListView listView;
    private ArrayList<HashMap<String,Object>> feed_list = new ArrayList<HashMap<String,Object>>();
    private ArrayAdapter<String> listAdapter;
    private SimpleAdapter adapter;
    private TextView textView1;
    private ListView eventListView;
    private api mApi;
    private List<Event> mEventList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApi = new api();
        mEventList = mApi.getEvents();

        for (int i = 0; i < event_list.length; i++) {
            HashMap<String, Object> item = new HashMap<String, Object>();
            item.put("Pic", mEventList.get(i).mPic);
            item.put("Event", mEventList.get(i).mTopic);
            item.put("Place", place_list[i]);
            item.put("Time", time_list[i]);
            item.put("Distance", dis_list[0]);

            feed_list.add(item);
        }


        //setContentView(R.layout.feed);
        //Log.i(TAG,"onCrate");

        //listView = (ListView) findViewById(R.id.listView);
        //listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, feed_list);

        //listView.setAdapter(listAdapter);
        //listView.setTextFilterEnabled(true);
        /*listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "你選擇的是" + event_list[position], Toast.LENGTH_SHORT).show();
            }});*/


        adapter = new SimpleAdapter(
                this,
                feed_list,
                R.layout.feed,
                new String[]{"Pic", "Event", "Place", "Time", "Distance"},
                new int[]{R.id.feed_imageView1, R.id.feed_textView1, R.id.feed_textView2, R.id.feed_textView3, R.id.feed_textView4});

        setListAdapter(adapter);
        eventListView = getListView();
        eventListView.setTextFilterEnabled(true);
        eventListView.scrollBy(0, 7);
        eventListView.setOnItemClickListener(
                new OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> arg0, View view,
                                            int position, long id) {
                        Log.i(TAG, "onItemClick position:" + position);
                        Intent intent = new Intent(getApplicationContext(), EventDetail.class);
                        intent.putExtra("event", mEventList.get(position));
                        startActivity(intent);
                    }
                }
        );
        //textView1 = (TextView)findViewById(R.id.feed_imageView1);
        //textView1.setMovementMethod(new ScrollingMovementMethod());
/*
        ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton1);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });*/
    }


    private static final String[] event_list = new String[] {
            "E1", "E2", "E3", "E4", "E5", "E6", "E7"
    };

    private static final String[] time_list = new String[] {
            "T1", "T2", "T3", "T4", "T5", "T6", "T7"
    };

    private static final String[] place_list = new String[] {
            "P1", "P2", "P3", "P4", "P5", "P6", "P7"
    };

    private static final int[] pic_list = new int[]{
            R.drawable.b1, R.drawable.sport1, R.drawable.museum1, R.drawable.party1,
            R.drawable.music1, R.drawable.picnic1, R.drawable.art1
    };

    private static final String[] dis_list = new String[] {
            "2.5 Miles"
    };

    private static final int[] bookmark_list = new int[]{
            R.drawable.bm1
    };
}