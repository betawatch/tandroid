package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
