package x8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import u8.o;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new o(17);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

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
        boolean z9 = this.d;
        wb.q(parcel, 5, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.e;
        wb.q(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        float f10 = this.f;
        wb.q(parcel, 7, 4);
        parcel.writeFloat(f10);
        wb.s(parcel, r10);
    }
}
