package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new o(8);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        double d = this.a;
        xb.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.b;
        xb.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        xb.s(parcel, r10);
    }
}
