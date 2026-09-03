package s7;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import j7.g5;
import r5.c0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new c0(9);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.m(parcel, 1, this.a);
        g5.g(parcel, 2, this.b);
        g5.k(parcel, 3, this.c, i10);
        g5.c(parcel, 4, this.d);
        g5.r(parcel, q10);
    }
}
