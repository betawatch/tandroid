package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new u8.o(29);
    public ArrayList a;
    public boolean b;
    public boolean c;
    public int d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.h(parcel, 1, this.a);
        boolean z9 = this.b;
        wb.q(parcel, 2, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.c;
        wb.q(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.d;
        wb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        wb.s(parcel, r10);
    }
}
