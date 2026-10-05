package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new r(19);
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
        long j3 = this.e;
        g0.s(parcel, 6, 8);
        parcel.writeLong(j3);
        int i12 = this.f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        g0.r(parcel, q6);
    }
}
