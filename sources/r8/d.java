package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new p7.n(9);
    public h a;
    public String b;
    public String c;
    public i[] d;
    public f[] e;
    public String[] f;
    public a[] h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.a, i10);
        h0.l(parcel, 3, this.b);
        h0.l(parcel, 4, this.c);
        h0.o(parcel, 5, this.d, i10);
        h0.o(parcel, 6, this.e, i10);
        h0.m(parcel, 7, this.f);
        h0.o(parcel, 8, this.h, i10);
        h0.r(parcel, q6);
    }
}
