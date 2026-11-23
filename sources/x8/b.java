package x8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import u8.o;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(17);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        cc.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        cc.q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.d;
        cc.q(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.e;
        cc.q(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.f;
        cc.q(parcel, 7, 4);
        parcel.writeFloat(f10);
        cc.s(parcel, r10);
    }
}
