package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.m(15);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        double d = this.a;
        f0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        f0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        f0.r(parcel, q6);
    }
}
