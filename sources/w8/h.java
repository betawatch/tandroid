package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.g0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new s(22);
    public String a;
    public String b;
    public f c;
    public g d;
    public g e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.a);
        g0.l(parcel, 3, this.b);
        g0.k(parcel, 4, this.c, i10);
        g0.k(parcel, 5, this.d, i10);
        g0.k(parcel, 6, this.e, i10);
        g0.r(parcel, q6);
    }
}
