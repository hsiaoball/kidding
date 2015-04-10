package kidding.kidding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    private static final String TAG ="Main" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCrete");
        final Intent intentFeed= new Intent(getApplicationContext(), feed_op.class);
        startActivity(intentFeed);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.action_settings:
                return true;
            case R.id.action_filter:
                setContentView(R.layout.filter);

            case R.id.feed:
                final Intent intentFeed= new Intent(getApplicationContext(), feed_op.class);
                startActivity(intentFeed);
                return true;
            case R.id.main:
                setContentView(R.layout.activity_main);
        }
        return super.onOptionsItemSelected(item);
    }
}
