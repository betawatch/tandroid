package s7;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import j7.f5;
import r5.c0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new c0(9);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.m(parcel, 1, this.a);
        f5.g(parcel, 2, this.b);
        f5.k(parcel, 3, this.c, i10);
        f5.c(parcel, 4, this.d);
        f5.r(parcel, q10);
    }
}
