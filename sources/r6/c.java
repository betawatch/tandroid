package r6;

import android.os.Parcel;
import android.os.Parcelable;
import p7.m;
import w7.f0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new m(6);
    public final int a;
    public final boolean b;

    public c(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        f0.r(parcel, q6);
    }
}
