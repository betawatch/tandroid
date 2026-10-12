package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.g0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new s(17);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        int i11 = this.a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.b);
        double d = this.c;
        g0.s(parcel, 4, 8);
        parcel.writeDouble(d);
        g0.l(parcel, 5, this.d);
        long j10 = this.e;
        g0.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        g0.r(parcel, q6);
    }
}
