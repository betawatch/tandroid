// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class uc1 extends b4 {
    public static final Parcelable.Creator<uc1> CREATOR = new qyd((byte) 10);
    public ArrayList a;
    public boolean b;
    public boolean c;
    public int d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.h(parcel, 1, this.a);
        boolean z = this.b;
        jte.q(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.c;
        jte.q(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i2 = this.d;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i2);
        jte.s(parcel, r);
    }
}
