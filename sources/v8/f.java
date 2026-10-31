package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(9);
    public ArrayList D;
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
    public int w;
    public ArrayList x;
    public w8.f y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.l(parcel, 3, this.b);
        h0.l(parcel, 4, this.c);
        h0.l(parcel, 5, this.d);
        h0.l(parcel, 6, this.e);
        h0.l(parcel, 7, this.f);
        h0.l(parcel, 8, this.h);
        h0.l(parcel, 9, this.n);
        h0.l(parcel, 10, this.r);
        h0.l(parcel, 11, this.s);
        int i11 = this.w;
        h0.s(parcel, 12, 4);
        parcel.writeInt(i11);
        h0.p(parcel, 13, this.x);
        h0.k(parcel, 14, this.y, i10);
        h0.p(parcel, 15, this.D);
        h0.l(parcel, 16, this.E);
        h0.l(parcel, 17, this.F);
        h0.p(parcel, 18, this.G);
        boolean z10 = this.H;
        h0.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.p(parcel, 20, this.I);
        h0.p(parcel, 21, this.J);
        h0.p(parcel, 22, this.K);
        h0.k(parcel, 23, this.L, i10);
        h0.r(parcel, q6);
    }
}
