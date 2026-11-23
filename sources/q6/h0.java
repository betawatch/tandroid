package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class h0 extends r6.a {
    public static final Parcelable.Creator<h0> CREATOR = new q4.x(9);
    public Bundle a;
    public n6.c[] b;
    public int c;
    public f d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.b(parcel, 1, this.a);
        bc.o(parcel, 2, this.b, i7);
        int i10 = this.c;
        bc.q(parcel, 3, 4);
        parcel.writeInt(i10);
        bc.k(parcel, 4, this.d, i7);
        bc.s(parcel, r10);
    }
}
