package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new o(3);
    public h a;
    public String b;
    public String c;
    public i[] d;
    public f[] e;
    public String[] f;
    public a[] h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 2, this.a, i7);
        wb.l(parcel, 3, this.b);
        wb.l(parcel, 4, this.c);
        wb.o(parcel, 5, this.d, i7);
        wb.o(parcel, 6, this.e, i7);
        wb.m(parcel, 7, this.f);
        wb.o(parcel, 8, this.h, i7);
        wb.s(parcel, r10);
    }
}
