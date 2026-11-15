package u6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import q4.x;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(27);
    public final boolean a;
    public final int b;

    public a(int i7, boolean z10) {
        this.a = z10;
        this.b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        yb.s(parcel, r10);
    }
}
