package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.a, i7);
        cc.l(parcel, 3, this.b);
        cc.l(parcel, 4, this.c);
        cc.o(parcel, 5, this.d, i7);
        cc.o(parcel, 6, this.e, i7);
        cc.m(parcel, 7, this.f);
        cc.o(parcel, 8, this.h, i7);
        cc.s(parcel, r10);
    }
}
