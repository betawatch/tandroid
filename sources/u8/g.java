package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new o(8);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        double d = this.a;
        cc.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.b;
        cc.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        cc.s(parcel, r10);
    }
}
