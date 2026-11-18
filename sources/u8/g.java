package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new o(8);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        double d = this.a;
        bc.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.b;
        bc.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        bc.s(parcel, r10);
    }
}
