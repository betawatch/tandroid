package w8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new b(0);
    public final PointF[] a;
    public final int b;

    public a(PointF[] pointFArr, int i3) {
        this.a = pointFArr;
        this.b = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.p(parcel, 2, this.a, i3);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.b);
        j8.a.t(parcel, s6);
    }
}
