package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.f0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        int q6 = f0.q(parcel, 20293);
        int i11 = this.a;
        f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 3, this.b);
        double d = this.c;
        f0.s(parcel, 4, 8);
        parcel.writeDouble(d);
        f0.l(parcel, 5, this.d);
        long j3 = this.e;
        f0.s(parcel, 6, 8);
        parcel.writeLong(j3);
        int i12 = this.f;
        f0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        f0.r(parcel, q6);
    }
}
