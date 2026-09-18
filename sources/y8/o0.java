package y8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String a;
    public final String b;
    public final long c;

    public o0(long j3, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j3;
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
