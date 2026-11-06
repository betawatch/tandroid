package x8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import u8.o;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(15);
    public final PointF[] a;
    public final int b;

    public a(PointF[] pointFArr, int i7) {
        this.a = pointFArr;
        this.b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.o(parcel, 2, this.a, i7);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        wb.s(parcel, r10);
    }
}
