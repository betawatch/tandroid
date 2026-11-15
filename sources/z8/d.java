package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import y8.v;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 3, this.b);
        double d = this.c;
        yb.q(parcel, 4, 8);
        parcel.writeDouble(d);
        yb.l(parcel, 5, this.d);
        long j3 = this.e;
        yb.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f;
        yb.q(parcel, 7, 4);
        parcel.writeInt(i11);
        yb.s(parcel, r10);
    }
}
