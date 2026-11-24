// default package

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class u4d extends b4 {
    public static final Parcelable.Creator<u4d> CREATOR = new igd((byte) 4);
    public final PointF[] a;
    public final int b;

    public u4d(PointF[] pointFArr, int i) {
        this.a = pointFArr;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.o(parcel, 2, this.a, i);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        jte.s(parcel, r);
    }
}
