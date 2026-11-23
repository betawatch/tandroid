package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(13);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        long j3 = this.a;
        bc.q(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.b;
        bc.q(parcel, 3, 8);
        parcel.writeLong(j10);
        bc.s(parcel, r10);
    }
}
