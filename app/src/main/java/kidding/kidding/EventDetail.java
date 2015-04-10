package kidding.kidding;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import kidding.kidding.api.Event;


public class EventDetail extends Activity {
    private Event mEvent;
    private TextView mTvTopic;
    private ImageView mIvBig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_detail);
        Bundle b=getIntent().getExtras();
        mEvent=b.getParcelable("event");
        mTvTopic=(TextView) findViewById(R.id.tv_topic);
        mTvTopic.setText(mEvent.mTopic);
        mIvBig=(ImageView) findViewById(R.id.image_big);
        if(mIvBig!=null)
            mIvBig.setImageResource(mEvent.mPic);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
