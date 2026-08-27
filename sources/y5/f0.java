package y5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f0 extends z5.a {
    public static final Parcelable.Creator<f0> CREATOR = new w7.f(17);
    public Bundle a;
    public v5.c[] b;
    public int c;
    public e d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.b(parcel, 1, this.a);
        r8.o(parcel, 2, this.b, i10);
        int i11 = this.c;
        r8.s(parcel, 3, 4);
        parcel.writeInt(i11);
        r8.k(parcel, 4, this.d, i10);
        r8.r(parcel, q6);
    }
}
