package y5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j extends z5.a {
    public static final Parcelable.Creator<j> CREATOR = new w7.f(12);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String h;
    public final int n;
    public final int r;

    public j(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = j10;
        this.e = j11;
        this.f = str;
        this.h = str2;
        this.n = i13;
        this.r = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        r8.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        r8.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        r8.l(parcel, 6, this.f);
        r8.l(parcel, 7, this.h);
        r8.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        r8.s(parcel, 9, 4);
        parcel.writeInt(this.r);
        r8.r(parcel, q6);
    }
}
