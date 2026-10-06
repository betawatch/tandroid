package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
