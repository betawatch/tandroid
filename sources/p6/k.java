package p6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends q6.a {
    public static final Parcelable.Creator<k> CREATOR = new n8.g(19);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String h;
    public final int n;
    public final int r;

    public k(int i3, int i10, int i11, long j10, long j11, String str, String str2, int i12, int i13) {
        this.a = i3;
        this.b = i10;
        this.c = i11;
        this.d = j10;
        this.e = j11;
        this.f = str;
        this.h = str2;
        this.n = i12;
        this.r = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        j8.a.r(parcel, 4, 8);
        parcel.writeLong(this.d);
        j8.a.r(parcel, 5, 8);
        parcel.writeLong(this.e);
        j8.a.m(parcel, 6, this.f);
        j8.a.m(parcel, 7, this.h);
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(this.n);
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(this.r);
        j8.a.t(parcel, s6);
    }
}
