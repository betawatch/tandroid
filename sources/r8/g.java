package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.j(17);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        double d = this.a;
        f0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        f0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        f0.r(parcel, q6);
    }
}
