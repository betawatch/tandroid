// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qe0 extends b4 {
    public static final Parcelable.Creator<qe0> CREATOR = new qyd((byte) 9);
    public int a;
    public String b;
    public String c;
    public String d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i2);
        jte.l(parcel, 3, this.b);
        jte.l(parcel, 4, this.c);
        jte.l(parcel, 5, this.d);
        jte.s(parcel, r);
    }
}
