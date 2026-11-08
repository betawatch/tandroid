package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class h0 extends r6.a {
    public static final Parcelable.Creator<h0> CREATOR = new q4.x(9);
    public Bundle a;
    public n6.c[] b;
    public int c;
    public f d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.b(parcel, 1, this.a);
        xb.o(parcel, 2, this.b, i7);
        int i10 = this.c;
        xb.q(parcel, 3, 4);
        parcel.writeInt(i10);
        xb.k(parcel, 4, this.d, i7);
        xb.s(parcel, r10);
    }
}
