package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new o(3);
    public h a;
    public String b;
    public String c;
    public i[] d;
    public f[] e;
    public String[] f;
    public a[] h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.a, i7);
        yb.l(parcel, 3, this.b);
        yb.l(parcel, 4, this.c);
        yb.o(parcel, 5, this.d, i7);
        yb.o(parcel, 6, this.e, i7);
        yb.m(parcel, 7, this.f);
        yb.o(parcel, 8, this.h, i7);
        yb.s(parcel, r10);
    }
}
