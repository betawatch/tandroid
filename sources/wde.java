// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wde extends b4 {
    public static final Parcelable.Creator<wde> CREATOR = new qyd((byte) 28);
    public final int a;
    public final long b;
    public final ArrayList c;

    public wde(int i, long j, ArrayList arrayList) {
        this.a = i;
        this.b = j;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        jte.p(parcel, 4, this.c);
        jte.s(parcel, r);
    }
}
