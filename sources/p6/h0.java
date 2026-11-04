package p6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h0 extends q6.a {
    public static final Parcelable.Creator<h0> CREATOR = new n8.g(24);
    public Bundle a;
    public m6.c[] b;
    public int c;
    public f d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.c(parcel, 1, this.a);
        j8.a.p(parcel, 2, this.b, i3);
        int i10 = this.c;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(i10);
        j8.a.l(parcel, 4, this.d, i3);
        j8.a.t(parcel, s6);
    }
}
