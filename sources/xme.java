// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xme extends b4 {
    public static final Parcelable.Creator<xme> CREATOR = new rhe((byte) 17);
    public Bundle a;
    public f84[] b;
    public int c;
    public fs2 d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.b(parcel, 1, this.a);
        jte.o(parcel, 2, this.b, i);
        int i2 = this.c;
        jte.q(parcel, 3, 4);
        parcel.writeInt(i2);
        jte.k(parcel, 4, this.d, i);
        jte.s(parcel, r);
    }
}
