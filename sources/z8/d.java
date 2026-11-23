package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import y8.v;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 3, this.b);
        double d = this.c;
        cc.q(parcel, 4, 8);
        parcel.writeDouble(d);
        cc.l(parcel, 5, this.d);
        long j3 = this.e;
        cc.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f;
        cc.q(parcel, 7, 4);
        parcel.writeInt(i11);
        cc.s(parcel, r10);
    }
}
