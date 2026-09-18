package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.f0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r(22);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        long j3 = this.a;
        f0.s(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.b;
        f0.s(parcel, 3, 8);
        parcel.writeLong(j10);
        f0.r(parcel, q6);
    }
}
