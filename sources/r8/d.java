package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.a, i10);
        g0.l(parcel, 3, this.b);
        g0.l(parcel, 4, this.c);
        g0.o(parcel, 5, this.d, i10);
        g0.o(parcel, 6, this.e, i10);
        g0.m(parcel, 7, this.f);
        g0.o(parcel, 8, this.h, i10);
        g0.r(parcel, q6);
    }
}
