package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new o(8);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        double d = this.a;
        wb.q(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.b;
        wb.q(parcel, 3, 8);
        parcel.writeDouble(d2);
        wb.s(parcel, r10);
    }
}
