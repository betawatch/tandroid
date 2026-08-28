package x5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends y5.a {
    public static final Parcelable.Creator<o> CREATOR = new w7.i(3);
    public final int a;
    public List b;

    public o(int i9, List list) {
        this.a = i9;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.p(parcel, 2, this.b);
        p8.r(parcel, q10);
    }
}
