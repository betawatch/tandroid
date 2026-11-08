package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new q4.x(7);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public o(int i7, int i10, int i11, boolean z9, boolean z10) {
        this.a = i7;
        this.b = z9;
        this.c = z10;
        this.d = i10;
        this.e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        xb.s(parcel, r10);
    }
}
