package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class h0 extends r6.a {
    public static final Parcelable.Creator<h0> CREATOR = new q4.x(9);
    public Bundle a;
    public n6.c[] b;
    public int c;
    public f d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.b(parcel, 1, this.a);
        yb.o(parcel, 2, this.b, i7);
        int i10 = this.c;
        yb.q(parcel, 3, 4);
        parcel.writeInt(i10);
        yb.k(parcel, 4, this.d, i7);
        yb.s(parcel, r10);
    }
}
