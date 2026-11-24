// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qpb extends b4 {
    public static final Parcelable.Creator<qpb> CREATOR = new sje(23);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        long j = this.a;
        mve.q(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.b;
        mve.q(parcel, 3, 8);
        parcel.writeLong(j2);
        mve.s(parcel, r);
    }
}
