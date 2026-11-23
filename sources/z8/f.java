package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import y8.v;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(13);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        long j3 = this.a;
        cc.q(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.b;
        cc.q(parcel, 3, 8);
        parcel.writeLong(j10);
        cc.s(parcel, r10);
    }
}
