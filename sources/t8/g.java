package t8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new q8.i(22);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        double d = this.a;
        j8.a.r(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        j8.a.r(parcel, 3, 8);
        parcel.writeDouble(d10);
        j8.a.t(parcel, s6);
    }
}
