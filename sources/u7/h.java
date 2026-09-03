package u7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new u6.p(4);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public h(boolean z4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.a = z4;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.e = z13;
        this.f = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        g5.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        g5.r(parcel, q10);
    }
}
