package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.f0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(20);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        long j10 = this.a;
        f0.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.b;
        f0.s(parcel, 3, 8);
        parcel.writeLong(j11);
        f0.r(parcel, q6);
    }
}
