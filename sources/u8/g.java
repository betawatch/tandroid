package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new o(8);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        double d = this.a;
        yb.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.b;
        yb.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        yb.s(parcel, r10);
    }
}
