package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
