package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import y8.v;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(13);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        long j3 = this.a;
        yb.q(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.b;
        yb.q(parcel, 3, 8);
        parcel.writeLong(j10);
        yb.s(parcel, r10);
    }
}
