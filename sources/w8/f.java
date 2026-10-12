package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.g0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(20);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        long j10 = this.a;
        g0.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.b;
        g0.s(parcel, 3, 8);
        parcel.writeLong(j11);
        g0.r(parcel, q6);
    }
}
