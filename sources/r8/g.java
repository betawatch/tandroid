package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.j(17);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        double d = this.a;
        e0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        e0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        e0.r(parcel, q6);
    }
}
