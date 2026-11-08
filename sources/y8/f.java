package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(3);
    public ArrayList D;
    public String E;
    public String F;
    public ArrayList G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public z8.c L;
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
    public int w;
    public ArrayList x;
    public z8.f y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.l(parcel, 3, this.b);
        xb.l(parcel, 4, this.c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.e);
        xb.l(parcel, 7, this.f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.n);
        xb.l(parcel, 10, this.r);
        xb.l(parcel, 11, this.s);
        int i10 = this.w;
        xb.q(parcel, 12, 4);
        parcel.writeInt(i10);
        xb.p(parcel, 13, this.x);
        xb.k(parcel, 14, this.y, i7);
        xb.p(parcel, 15, this.D);
        xb.l(parcel, 16, this.E);
        xb.l(parcel, 17, this.F);
        xb.p(parcel, 18, this.G);
        boolean z9 = this.H;
        xb.q(parcel, 19, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.p(parcel, 20, this.I);
        xb.p(parcel, 21, this.J);
        xb.p(parcel, 22, this.K);
        xb.k(parcel, 23, this.L, i7);
        xb.s(parcel, r10);
    }
}
