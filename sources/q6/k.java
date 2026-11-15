package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new q4.x(4);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String h;
    public final int n;
    public final int r;

    public k(int i7, int i10, int i11, long j3, long j10, String str, String str2, int i12, int i13) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = j3;
        this.e = j10;
        this.f = str;
        this.h = str2;
        this.n = i12;
        this.r = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        yb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        yb.q(parcel, 5, 8);
        parcel.writeLong(this.e);
        yb.l(parcel, 6, this.f);
        yb.l(parcel, 7, this.h);
        yb.q(parcel, 8, 4);
        parcel.writeInt(this.n);
        yb.q(parcel, 9, 4);
        parcel.writeInt(this.r);
        yb.s(parcel, r10);
    }
}
