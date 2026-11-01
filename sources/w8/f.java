package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.h0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(19);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        long j10 = this.a;
        h0.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.b;
        h0.s(parcel, 3, 8);
        parcel.writeLong(j11);
        h0.r(parcel, q6);
    }
}
