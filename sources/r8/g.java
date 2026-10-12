package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.m(15);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        double d = this.a;
        g0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        g0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        g0.r(parcel, q6);
    }
}
