// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ovd extends b4 {
    public static final Parcelable.Creator<ovd> CREATOR = new rpd((byte) 24);
    public final int a;
    public final kpd b;

    public ovd(int i, kpd kpdVar) {
        this.a = i;
        this.b = kpdVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.k(parcel, 3, this.b, i);
        jte.s(parcel, r);
    }
}
