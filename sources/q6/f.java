package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new q4.x(10);
    public final o a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public f(o oVar, boolean z10, boolean z11, int[] iArr, int i7, int[] iArr2) {
        this.a = oVar;
        this.b = z10;
        this.c = z11;
        this.d = iArr;
        this.e = i7;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 1, this.a, i7);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        yb.g(parcel, 4, this.d);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        yb.g(parcel, 6, this.f);
        yb.s(parcel, r10);
    }
}
