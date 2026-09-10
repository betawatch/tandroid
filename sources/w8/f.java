package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.e0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r(22);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        long j3 = this.a;
        e0.s(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.b;
        e0.s(parcel, 3, 8);
        parcel.writeLong(j10);
        e0.r(parcel, q6);
    }
}
