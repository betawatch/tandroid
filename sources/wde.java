// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wde extends b4 {
    public static final Parcelable.Creator<wde> CREATOR = new qyd((byte) 28);
    public final int a;
    public final long b;
    public final ArrayList c;

    public wde(int i, long j, ArrayList arrayList) {
        this.a = i;
        this.b = j;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        jte.p(parcel, 4, this.c);
        jte.s(parcel, r);
    }
}
