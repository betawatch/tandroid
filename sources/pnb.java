// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pnb extends b4 {
    public static final Parcelable.Creator<pnb> CREATOR = new rhe(23);
    public long a;
    public long b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        long j = this.a;
        jte.q(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.b;
        jte.q(parcel, 3, 8);
        parcel.writeLong(j2);
        jte.s(parcel, r);
    }
}
