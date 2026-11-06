package u8;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new o(1);
    public e D;
    public byte[] E;
    public boolean F;
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public f f;
    public i h;
    public j n;
    public l r;
    public k s;
    public g w;
    public c x;
    public d y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        wb.l(parcel, 3, this.b);
        wb.l(parcel, 4, this.c);
        int i11 = this.d;
        wb.q(parcel, 5, 4);
        parcel.writeInt(i11);
        wb.o(parcel, 6, this.e, i7);
        wb.k(parcel, 7, this.f, i7);
        wb.k(parcel, 8, this.h, i7);
        wb.k(parcel, 9, this.n, i7);
        wb.k(parcel, 10, this.r, i7);
        wb.k(parcel, 11, this.s, i7);
        wb.k(parcel, 12, this.w, i7);
        wb.k(parcel, 13, this.x, i7);
        wb.k(parcel, 14, this.y, i7);
        wb.k(parcel, 15, this.D, i7);
        wb.c(parcel, 16, this.E);
        boolean z9 = this.F;
        wb.q(parcel, 17, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.s(parcel, r10);
    }
}
