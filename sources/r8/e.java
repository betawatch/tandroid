package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new p7.j(15);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public String r;
    public String s;
    public String v;
    public String w;
    public String x;
    public String y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.a);
        d0.l(parcel, 3, this.b);
        d0.l(parcel, 4, this.c);
        d0.l(parcel, 5, this.d);
        d0.l(parcel, 6, this.e);
        d0.l(parcel, 7, this.f);
        d0.l(parcel, 8, this.h);
        d0.l(parcel, 9, this.n);
        d0.l(parcel, 10, this.r);
        d0.l(parcel, 11, this.s);
        d0.l(parcel, 12, this.v);
        d0.l(parcel, 13, this.w);
        d0.l(parcel, 14, this.x);
        d0.l(parcel, 15, this.y);
        d0.r(parcel, q6);
    }
}
