// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum ytb implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("present"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("not-supported");

    public static final Parcelable.Creator<ytb> CREATOR = new ced((byte) 8);
    public final String a;

    ytb(String str) {
        this.a = str;
    }

    public static ytb a(String str) {
        for (ytb ytbVar : values()) {
            if (str.equals(ytbVar.a)) {
                return ytbVar;
            }
        }
        throw new ztb(qd4.y("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
