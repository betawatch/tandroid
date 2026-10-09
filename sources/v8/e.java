package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new r(11);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.h(parcel, 2, this.a);
        d0.l(parcel, 4, this.b);
        d0.l(parcel, 5, this.c);
        d0.h(parcel, 6, this.d);
        boolean z10 = this.e;
        d0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.l(parcel, 8, this.f);
        d0.r(parcel, q6);
    }
}
