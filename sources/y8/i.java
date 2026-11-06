package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.identity.intents.model.UserAddress;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new u8.o(19);
    public String a;
    public b b;
    public UserAddress c;
    public k d;
    public String e;
    public Bundle f;
    public String h;
    public Bundle n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.a);
        wb.k(parcel, 2, this.b, i7);
        wb.k(parcel, 3, this.c, i7);
        wb.k(parcel, 4, this.d, i7);
        wb.l(parcel, 5, this.e);
        wb.b(parcel, 6, this.f);
        wb.l(parcel, 7, this.h);
        wb.b(parcel, 8, this.n);
        wb.s(parcel, r10);
    }
}
