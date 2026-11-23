package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new v(3);
    public ArrayList E;
    public String F;
    public String G;
    public ArrayList H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public ArrayList L;
    public z8.c M;
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
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.a);
        cc.l(parcel, 3, this.b);
        cc.l(parcel, 4, this.c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.e);
        cc.l(parcel, 7, this.f);
        cc.l(parcel, 8, this.h);
        cc.l(parcel, 9, this.n);
        cc.l(parcel, 10, this.r);
        cc.l(parcel, 11, this.s);
        int i10 = this.w;
        cc.q(parcel, 12, 4);
        parcel.writeInt(i10);
        cc.p(parcel, 13, this.x);
        cc.k(parcel, 14, this.y, i7);
        cc.p(parcel, 15, this.E);
        cc.l(parcel, 16, this.F);
        cc.l(parcel, 17, this.G);
        cc.p(parcel, 18, this.H);
        boolean z10 = this.I;
        cc.q(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.p(parcel, 20, this.J);
        cc.p(parcel, 21, this.K);
        cc.p(parcel, 22, this.L);
        cc.k(parcel, 23, this.M, i7);
        cc.s(parcel, r10);
    }
}
