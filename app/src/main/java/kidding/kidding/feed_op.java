package kidding.kidding;

import android.app.Activity;
import android.os.Bundle;
import android.app.ListActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Vicky on 3/10/15.
 */
public class feed_op extends Activity {
    private static final String TAG ="feed_op" ;
    private ListView listView;
    private String[] list = {"鉛筆", "原子筆", "鋼筆", "毛筆", "彩色筆"};
    private ArrayAdapter<String> listAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.feed);
        Log.i(TAG,"onCrate");

        listView = (ListView) findViewById(R.id.listView);
        listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);

        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "你選擇的是" + list[position], Toast.LENGTH_SHORT).show();
            }}
        );
    }
}