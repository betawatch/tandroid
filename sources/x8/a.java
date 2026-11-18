package x8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import u8.o;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(15);
    public final PointF[] a;
    public final int b;

    public a(PointF[] pointFArr, int i7) {
        this.a = pointFArr;
        this.b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.o(parcel, 2, this.a, i7);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        bc.s(parcel, r10);
    }
}
