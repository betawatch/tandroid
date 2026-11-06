package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new u8.o(28);
    public String a;
    public String b;
    public String c;
    public int d;
    public UserAddress e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.a);
        wb.l(parcel, 2, this.b);
        wb.l(parcel, 3, this.c);
        int i10 = this.d;
        wb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        wb.k(parcel, 5, this.e, i7);
        wb.s(parcel, r10);
    }
}
