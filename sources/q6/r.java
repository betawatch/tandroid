package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new q4.x(3);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public r(int i7, int i10, long j3, String str, boolean z9) {
        this.a = i7;
        this.b = str;
        this.c = j3;
        this.d = i10;
        this.e = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.l(parcel, 2, this.b);
        xb.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        xb.s(parcel, r10);
    }
}
