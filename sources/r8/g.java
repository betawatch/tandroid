package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.n(14);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        double d = this.a;
        h0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        h0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        h0.r(parcel, q6);
    }
}
