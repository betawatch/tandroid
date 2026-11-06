package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new v(2);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.h(parcel, 2, this.a);
        wb.l(parcel, 4, this.b);
        wb.l(parcel, 5, this.c);
        wb.h(parcel, 6, this.d);
        boolean z9 = this.e;
        wb.q(parcel, 7, 4);
        parcel.writeInt(z9 ? 1 : 0);
        wb.l(parcel, 8, this.f);
        wb.s(parcel, r10);
    }
}
