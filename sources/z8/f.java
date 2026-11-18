package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import y8.v;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
