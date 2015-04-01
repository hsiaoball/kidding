package kidding.kidding.api;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by ChiYo Hsiao on 2/2/2015.
 */
public class Event implements Parcelable {
    public String mTopic;
    public Date mTime;
    public int mType;
    public int mCost;
    public String mContent;
    public Bitmap mImage;
    public String mAddress;
    public String mCity;
    public String mState;
    public String mZip;
    public String mOrganizer;
    public String mWebSite;
    public String mParking;
    public int mMinAge;
    public int mMaxAge;
    public String mPhone;

    public Event(String topic, int type, Long time, int cost, int minAge, int maxAge, String content) {
        mTopic = topic;
        mType = type;
        mTime = new Date(time);
        mCost = cost;
        mContent = content;
        mMaxAge = maxAge;
        mMinAge = minAge;
        //mImage=image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mTopic);
        parcel.writeInt(mType);
        parcel.writeLong(mTime.getTime());
        parcel.writeInt(mCost);
        parcel.writeInt(mMinAge);
        parcel.writeInt(mMaxAge);
        parcel.writeString(mContent);

    }

    public static final Parcelable.Creator<Event> CREATOR = new Creator<Event>() {
        public Event createFromParcel(Parcel source) {
            return new Event(
                    source.readString(),
                    source.readInt(),
                    source.readLong(),
                    source.readInt(),
                    source.readInt(),
                    source.readInt(),
                    source.readString()
            );
        }

        @Override
        public Event[] newArray(int i) {
            return new Event[0];
        }
    };
}
