package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.j(13);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public b f;
    public b h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.a);
        d0.l(parcel, 3, this.b);
        d0.l(parcel, 4, this.c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.e);
        d0.k(parcel, 7, this.f, i10);
        d0.k(parcel, 8, this.h, i10);
        d0.r(parcel, q6);
    }
}
