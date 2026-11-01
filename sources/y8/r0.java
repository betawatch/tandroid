package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class r0 extends o6.a {
    public static final Parcelable.Creator<r0> CREATOR = new l0(6);
    public final int a;
    public final int b;

    public r0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        w7.h0.r(parcel, q6);
    }
}
