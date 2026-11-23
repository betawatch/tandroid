package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q4.x;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(27);
    public final boolean a;
    public final int b;

    public a(int i7, boolean z10) {
        this.a = z10;
        this.b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        bc.s(parcel, r10);
    }
}
