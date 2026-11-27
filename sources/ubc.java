// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum ubc implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("required"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("discouraged");

    public static final Parcelable.Creator<ubc> CREATOR = new ced((byte) 21);
    public final String a;

    ubc(String str) {
        this.a = str;
    }

    public static ubc a(String str) {
        for (ubc ubcVar : values()) {
            if (str.equals(ubcVar.a)) {
                return ubcVar;
            }
        }
        throw new xgd(qd4.y("User verification requirement ", str, " not supported"));
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
