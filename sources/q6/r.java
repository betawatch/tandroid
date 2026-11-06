package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new q4.x(3);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public r(int i7, int i10, long j3, String str, boolean z9) {
        this.a = i7;
        this.b = str;
        this.c = j3;
        this.d = i10;
        this.e = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        wb.l(parcel, 2, this.b);
        wb.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        wb.s(parcel, r10);
    }
}
