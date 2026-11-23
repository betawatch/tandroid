package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new x(29);
    public final int a;
    public final boolean b;

    public c(int i7, boolean z10) {
        this.a = i7;
        this.b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bc.s(parcel, r10);
    }
}
