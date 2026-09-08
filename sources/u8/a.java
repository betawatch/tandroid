package u8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p7.j;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(24);
    public final PointF[] a;
    public final int b;

    public a(PointF[] pointFArr, int i10) {
        this.a = pointFArr;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.o(parcel, 2, this.a, i10);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        e0.r(parcel, q6);
    }
}
