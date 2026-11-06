package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import q4.x;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(15);
    public final int a;
    public final n6.a b;
    public final q6.x c;

    public h(int i7, n6.a aVar, q6.x xVar) {
        this.a = i7;
        this.b = aVar;
        this.c = xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        wb.k(parcel, 2, this.b, i7);
        wb.k(parcel, 3, this.c, i7);
        wb.s(parcel, r10);
    }
}
