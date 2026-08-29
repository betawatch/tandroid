package q7;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.internal.cast.o;
import o6.w0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new w0(18);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.m(parcel, 1, this.a);
        o.g(parcel, 2, this.b);
        o.k(parcel, 3, this.c, i10);
        o.c(parcel, 4, this.d);
        o.r(parcel, q6);
    }
}
