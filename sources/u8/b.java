package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(2);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public String n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.b;
        wb.q(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.c;
        wb.q(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        wb.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.e;
        wb.q(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f;
        wb.q(parcel, 7, 4);
        parcel.writeInt(i15);
        boolean z9 = this.h;
        wb.q(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.l(parcel, 9, this.n);
        wb.s(parcel, r10);
    }
}
