package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class p extends o6.a {
    public static final Parcelable.Creator<p> CREATOR = new c(11);
    public final int a;
    public final b b;

    public p(int i10, b bVar) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.f0.k(parcel, 3, this.b, i10);
        w7.f0.r(parcel, q6);
    }
}
