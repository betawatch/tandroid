package p8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new m6.e(20);
    public final long a;
    public final a[] b;
    public final int c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i7, boolean z9) {
        this.a = j3;
        this.b = aVarArr;
        this.d = z9;
        if (z9) {
            this.c = i7;
        } else {
            this.c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        wb.o(parcel, 3, this.b, i7);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        wb.s(parcel, r10);
    }
}
