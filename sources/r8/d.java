package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p7.j(12);
    public h a;
    public String b;
    public String c;
    public i[] d;
    public f[] e;
    public String[] f;
    public a[] h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 2, this.a, i10);
        e0.l(parcel, 3, this.b);
        e0.l(parcel, 4, this.c);
        e0.o(parcel, 5, this.d, i10);
        e0.o(parcel, 6, this.e, i10);
        e0.m(parcel, 7, this.f);
        e0.o(parcel, 8, this.h, i10);
        e0.r(parcel, q6);
    }
}
