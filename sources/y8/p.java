package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.e0.k(parcel, 3, this.b, i10);
        w7.e0.r(parcel, q6);
    }
}
