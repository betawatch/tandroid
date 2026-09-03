package q6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum j0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF8("required"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("discouraged");

    public static final Parcelable.Creator<j0> CREATOR = new r0(10);
    public final String a;

    j0(String str) {
        this.a = str;
    }

    public static j0 a(String str) {
        for (j0 j0Var : values()) {
            if (str.equals(j0Var.a)) {
                return j0Var;
            }
        }
        throw new t0(android.support.v4.media.a.o("User verification requirement ", str, " not supported"));
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
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
    }
}
