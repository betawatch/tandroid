package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new o(6);
    public String D;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public String r;
    public String s;
    public String w;
    public String x;
    public String y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.a);
        wb.l(parcel, 3, this.b);
        wb.l(parcel, 4, this.c);
        wb.l(parcel, 5, this.d);
        wb.l(parcel, 6, this.e);
        wb.l(parcel, 7, this.f);
        wb.l(parcel, 8, this.h);
        wb.l(parcel, 9, this.n);
        wb.l(parcel, 10, this.r);
        wb.l(parcel, 11, this.s);
        wb.l(parcel, 12, this.w);
        wb.l(parcel, 13, this.x);
        wb.l(parcel, 14, this.y);
        wb.l(parcel, 15, this.D);
        wb.s(parcel, r10);
    }
}
