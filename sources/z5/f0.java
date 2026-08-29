package z5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f0 extends a6.a {
    public static final Parcelable.Creator<f0> CREATOR = new w5.k(21);
    public Bundle a;
    public w5.c[] b;
    public int c;
    public e d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.b(parcel, 1, this.a);
        com.google.android.gms.internal.cast.o.o(parcel, 2, this.b, i10);
        int i11 = this.c;
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.d, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
