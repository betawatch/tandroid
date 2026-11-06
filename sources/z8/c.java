package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import y8.v;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new v(11);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.a);
        wb.k(parcel, 3, this.b, i7);
        wb.k(parcel, 5, this.c, i7);
        wb.s(parcel, r10);
    }
}
