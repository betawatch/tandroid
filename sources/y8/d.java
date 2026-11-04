package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new w8.b(25);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 3, this.b);
        double d = this.c;
        j8.a.r(parcel, 4, 8);
        parcel.writeDouble(d);
        j8.a.m(parcel, 5, this.d);
        long j10 = this.e;
        j8.a.r(parcel, 6, 8);
        parcel.writeLong(j10);
        int i11 = this.f;
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(i11);
        j8.a.t(parcel, s6);
    }
}
