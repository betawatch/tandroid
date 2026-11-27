// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wdf extends c4 {
    public static final Parcelable.Creator<wdf> CREATOR = new t4f((byte) 17);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.m(parcel, 1, this.a);
        bye.g(parcel, 2, this.b);
        bye.k(parcel, 3, this.c, i);
        bye.c(parcel, 4, this.d);
        bye.s(parcel, r);
    }
}
