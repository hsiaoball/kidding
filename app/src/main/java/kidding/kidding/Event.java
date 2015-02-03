package kidding.kidding;

import android.graphics.Bitmap;

import java.util.Date;

/**
 * Created by ChiYo Hsiao on 2/2/2015.
 */
public class Event {
    public String mTopic;
    public Date mTime;
    public int mCost;
    public String mContent;
    public Bitmap mImage;

    public Event(String topic, Date time, int cost, String content, Bitmap image){
        mTopic=topic;
        mTime=time;
        mCost=cost;
        mContent=content;
        mImage=image;
    }
}
