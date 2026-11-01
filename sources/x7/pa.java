package x7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class pa extends o6.a {
    public static final Parcelable.Creator<pa> CREATOR = new n5(3);
    public final float a;
    public final int b;

    public pa(float f7, int i10) {
        this.a = f7;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeFloat(this.a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        w7.h0.r(parcel, q6);
    }
}
