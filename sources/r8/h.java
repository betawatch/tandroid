package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(15);
    public final int a;
    public final n6.a b;
    public final q6.x c;

    public h(int i7, n6.a aVar, q6.x xVar) {
        this.a = i7;
        this.b = aVar;
        this.c = xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.k(parcel, 2, this.b, i7);
        bc.k(parcel, 3, this.c, i7);
        bc.s(parcel, r10);
    }
}
