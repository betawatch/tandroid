package x8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import u8.o;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        int r10 = yb.r(parcel, 20293);
        int i10 = this.a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        yb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        boolean z10 = this.d;
        yb.q(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.e;
        yb.q(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.f;
        yb.q(parcel, 7, 4);
        parcel.writeFloat(f10);
        yb.s(parcel, r10);
    }
}
