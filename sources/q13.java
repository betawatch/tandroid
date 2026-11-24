// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q13 extends b4 {
    public static final Parcelable.Creator<q13> CREATOR = new x21((byte) 13);
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final String f;

    public q13(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        boolean z = (f9b.h(str3) || f9b.h(str4)) ? false : true;
        boolean z2 = !f9b.h(str) && str3.length() == 0 && str4.length() == 0;
        if (z || z2) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + String.valueOf(str).length() + 31 + String.valueOf(str3).length() + 19 + 69);
        ls6.u(sb, "Either type: ", str, ", or requestType: ", str3);
        w26.j(ls6.o(" and protocolType: ", str4, " must be specified, but at least one contains an invalid blank value.", sb));
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.b(parcel, 2, this.b);
        jte.b(parcel, 3, this.c);
        jte.l(parcel, 4, this.d);
        jte.l(parcel, 5, this.e);
        jte.l(parcel, 6, this.f);
        jte.s(parcel, r);
    }
}
