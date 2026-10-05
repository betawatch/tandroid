package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r(22);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        long j3 = this.a;
        g0.s(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.b;
        g0.s(parcel, 3, 8);
        parcel.writeLong(j10);
        g0.r(parcel, q6);
    }
}
