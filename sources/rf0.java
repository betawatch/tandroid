// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rf0 extends b4 {
    public static final Parcelable.Creator<rf0> CREATOR = new sje((byte) 9);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        double d = this.a;
        mve.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.b;
        mve.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        mve.s(parcel, r);
    }
}
