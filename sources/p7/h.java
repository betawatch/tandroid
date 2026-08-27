package p7;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import h7.r8;
import n6.w0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new w0(14);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.m(parcel, 1, this.a);
        r8.g(parcel, 2, this.b);
        r8.k(parcel, 3, this.c, i10);
        r8.c(parcel, 4, this.d);
        r8.r(parcel, q6);
    }
}
