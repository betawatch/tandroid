package x5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends y5.a {
    public static final Parcelable.Creator<j> CREATOR = new w7.i(4);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String h;
    public final int n;
    public final int r;

    public j(int i9, int i10, int i11, long j10, long j11, String str, String str2, int i12, int i13) {
        this.a = i9;
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        p8.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        p8.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        p8.l(parcel, 6, this.f);
        p8.l(parcel, 7, this.h);
        p8.s(parcel, 8, 4);
        parcel.writeInt(this.n);
        p8.s(parcel, 9, 4);
        parcel.writeInt(this.r);
        p8.r(parcel, q10);
    }
}
