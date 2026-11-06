package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import y8.v;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        int r10 = xb.r(parcel, 20293);
        int i10 = this.a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.b);
        double d = this.c;
        xb.q(parcel, 4, 8);
        parcel.writeDouble(d);
        xb.l(parcel, 5, this.d);
        long j3 = this.e;
        xb.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i11);
        xb.s(parcel, r10);
    }
}
