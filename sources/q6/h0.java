package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class h0 extends r6.a {
    public static final Parcelable.Creator<h0> CREATOR = new q4.x(9);
    public Bundle a;
    public n6.c[] b;
    public int c;
    public f d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.b(parcel, 1, this.a);
        cc.o(parcel, 2, this.b, i7);
        int i10 = this.c;
        cc.q(parcel, 3, 4);
        parcel.writeInt(i10);
        cc.k(parcel, 4, this.d, i7);
        cc.s(parcel, r10);
    }
}
