package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        w7.e0.c(parcel, 3, this.c);
        w7.e0.r(parcel, q6);
    }
}
