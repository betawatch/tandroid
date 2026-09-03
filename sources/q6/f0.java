package q6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public enum f0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF8("present"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("not-supported");

    public static final Parcelable.Creator<f0> CREATOR = new r0(6);
    public final String a;

    f0(String str) {
        this.a = str;
    }

    public static f0 a(String str) {
        for (f0 f0Var : values()) {
            if (str.equals(f0Var.a)) {
                return f0Var;
            }
        }
        throw new g0(android.support.v4.media.a.o("TokenBindingStatus ", str, " not supported"));
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
