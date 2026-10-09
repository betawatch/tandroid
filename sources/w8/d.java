package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        int q6 = d0.q(parcel, 20293);
        int i11 = this.a;
        d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.l(parcel, 3, this.b);
        double d = this.c;
        d0.s(parcel, 4, 8);
        parcel.writeDouble(d);
        d0.l(parcel, 5, this.d);
        long j3 = this.e;
        d0.s(parcel, 6, 8);
        parcel.writeLong(j3);
        int i12 = this.f;
        d0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        d0.r(parcel, q6);
    }
}
