// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zre extends b4 {
    public static final Parcelable.Creator<zre> CREATOR = new rhe((byte) 5);
    public int a;
    public boolean b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.b;
        jte.q(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        jte.s(parcel, r);
    }
}
