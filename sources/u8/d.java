package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.a, i7);
        bc.l(parcel, 3, this.b);
        bc.l(parcel, 4, this.c);
        bc.o(parcel, 5, this.d, i7);
        bc.o(parcel, 6, this.e, i7);
        bc.m(parcel, 7, this.f);
        bc.o(parcel, 8, this.h, i7);
        bc.s(parcel, r10);
    }
}
