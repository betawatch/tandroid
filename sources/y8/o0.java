package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String a;
    public final String b;
    public final long c;

    public o0(long j10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.a);
        w7.f0.l(parcel, 3, this.b);
        w7.f0.s(parcel, 4, 8);
        parcel.writeLong(this.c);
        w7.f0.r(parcel, q6);
    }
}
