package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new r(24);
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
