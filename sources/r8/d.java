package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 2, this.a, i10);
        d0.l(parcel, 3, this.b);
        d0.l(parcel, 4, this.c);
        d0.o(parcel, 5, this.d, i10);
        d0.o(parcel, 6, this.e, i10);
        d0.m(parcel, 7, this.f);
        d0.o(parcel, 8, this.h, i10);
        d0.r(parcel, q6);
    }
}
