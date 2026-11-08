package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.a, i7);
        xb.l(parcel, 3, this.b);
        xb.l(parcel, 4, this.c);
        xb.o(parcel, 5, this.d, i7);
        xb.o(parcel, 6, this.e, i7);
        xb.m(parcel, 7, this.f);
        xb.o(parcel, 8, this.h, i7);
        xb.s(parcel, r10);
    }
}
