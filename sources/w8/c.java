package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.s;
import w7.g0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new s(18);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.a);
        g0.k(parcel, 3, this.b, i10);
        g0.k(parcel, 5, this.c, i10);
        g0.r(parcel, q6);
    }
}
