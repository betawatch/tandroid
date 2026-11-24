// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pnb extends b4 {
    public static final Parcelable.Creator<pnb> CREATOR = new rhe(23);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        long j = this.a;
        jte.q(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.b;
        jte.q(parcel, 3, 8);
        parcel.writeLong(j2);
        jte.s(parcel, r);
    }
}
