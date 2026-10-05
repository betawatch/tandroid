package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class m0 extends o6.a {
    public static final Parcelable.Creator<m0> CREATOR = new n0(0);
    public final int a;
    public final f b;

    public m0(int i10, f fVar) {
        this.a = i10;
        this.b = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.g0.k(parcel, 3, this.b, i10);
        w7.g0.r(parcel, q6);
    }
}
