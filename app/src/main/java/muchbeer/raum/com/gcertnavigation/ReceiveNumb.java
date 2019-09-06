package muchbeer.raum.com.gcertnavigation;

import android.os.Parcel;
import android.os.Parcelable;

public class ReceiveNumb implements Parcelable {



    //property basics
    private int streetNumber;
    private String userName;

    protected ReceiveNumb(Parcel in) {
        streetNumber = in.readInt();
        userName = in.readString();
    }

    public static final Creator<ReceiveNumb> CREATOR = new Creator<ReceiveNumb>() {
        @Override
        public ReceiveNumb createFromParcel(Parcel in) {
            return new ReceiveNumb(in);
        }

        @Override
        public ReceiveNumb[] newArray(int size) {
            return new ReceiveNumb[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(streetNumber);
        parcel.writeString(userName);
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
