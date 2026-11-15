package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.l(parcel, 3, this.b);
        yb.l(parcel, 4, this.c);
        yb.l(parcel, 5, this.d);
        yb.l(parcel, 6, this.e);
        yb.l(parcel, 7, this.f);
        yb.l(parcel, 8, this.h);
        yb.l(parcel, 9, this.n);
        yb.l(parcel, 10, this.r);
        yb.l(parcel, 11, this.s);
        int i10 = this.w;
        yb.q(parcel, 12, 4);
        parcel.writeInt(i10);
        yb.p(parcel, 13, this.x);
        yb.k(parcel, 14, this.y, i7);
        yb.p(parcel, 15, this.E);
        yb.l(parcel, 16, this.F);
        yb.l(parcel, 17, this.G);
        yb.p(parcel, 18, this.H);
        boolean z10 = this.I;
        yb.q(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.p(parcel, 20, this.J);
        yb.p(parcel, 21, this.K);
        yb.p(parcel, 22, this.L);
        yb.k(parcel, 23, this.M, i7);
        yb.s(parcel, r10);
    }
}
