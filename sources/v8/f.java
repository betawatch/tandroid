package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new r(12);
    public String E;
    public String F;
    public ArrayList G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public w8.c L;
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
    public int v;
    public ArrayList w;
    public w8.f x;
    public ArrayList y;

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
        int i11 = this.v;
        d0.s(parcel, 12, 4);
        parcel.writeInt(i11);
        d0.p(parcel, 13, this.w);
        d0.k(parcel, 14, this.x, i10);
        d0.p(parcel, 15, this.y);
        d0.l(parcel, 16, this.E);
        d0.l(parcel, 17, this.F);
        d0.p(parcel, 18, this.G);
        boolean z10 = this.H;
        d0.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d0.p(parcel, 20, this.I);
        d0.p(parcel, 21, this.J);
        d0.p(parcel, 22, this.K);
        d0.k(parcel, 23, this.L, i10);
        d0.r(parcel, q6);
    }
}
