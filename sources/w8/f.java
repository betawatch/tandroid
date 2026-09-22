package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.f0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
