package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new p7.j(17);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        double d = this.a;
        d0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        d0.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        d0.r(parcel, q6);
    }
}
