package x8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import u8.o;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int r10 = yb.r(parcel, 20293);
        yb.o(parcel, 2, this.a, i7);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        yb.s(parcel, r10);
    }
}
