package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import y8.v;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(13);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        long j3 = this.a;
        wb.q(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.b;
        wb.q(parcel, 3, 8);
        parcel.writeLong(j10);
        wb.s(parcel, r10);
    }
}
