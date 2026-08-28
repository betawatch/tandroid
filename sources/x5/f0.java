package x5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f0 extends y5.a {
    public static final Parcelable.Creator<f0> CREATOR = new w7.i(9);
    public Bundle a;
    public u5.c[] b;
    public int c;
    public e d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.b(parcel, 1, this.a);
        p8.o(parcel, 2, this.b, i9);
        int i10 = this.c;
        p8.s(parcel, 3, 4);
        parcel.writeInt(i10);
        p8.k(parcel, 4, this.d, i9);
        p8.r(parcel, q10);
    }
}
