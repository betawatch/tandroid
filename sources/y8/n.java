package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new u8.o(25);
    public int a;
    public String b;
    public String c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.a;
        bc.q(parcel, 1, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 2, this.b);
        bc.l(parcel, 3, this.c);
        bc.s(parcel, r10);
    }
}
