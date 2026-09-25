package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int a;
    public final boolean b;

    public s(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.f0.s(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
