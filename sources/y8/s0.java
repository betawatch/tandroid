package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int a;
    public final int b;
    public final byte[] c;

    public s0(int i10, int i11, byte[] bArr) {
        this.a = i10;
        this.b = i11;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        w7.f0.c(parcel, 3, this.c);
        w7.f0.r(parcel, q6);
    }
}
