package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import y8.v;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new v(10);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        wb.l(parcel, 3, this.b);
        double d = this.c;
        wb.q(parcel, 4, 8);
        parcel.writeDouble(d);
        wb.l(parcel, 5, this.d);
        long j3 = this.e;
        wb.q(parcel, 6, 8);
        parcel.writeLong(j3);
        int i11 = this.f;
        wb.q(parcel, 7, 4);
        parcel.writeInt(i11);
        wb.s(parcel, r10);
    }
}
