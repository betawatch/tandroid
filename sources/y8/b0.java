package y8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new c(23);
    public final int a;
    public final ParcelFileDescriptor b;

    public b0(int i10, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i10;
        this.b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.f0.k(parcel, 3, this.b, i10 | 1);
        w7.f0.r(parcel, q6);
    }
}
