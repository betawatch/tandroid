package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.l(parcel, 3, this.b);
        bc.l(parcel, 4, this.c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.e);
        bc.l(parcel, 7, this.f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.n);
        bc.l(parcel, 10, this.r);
        bc.l(parcel, 11, this.s);
        int i10 = this.w;
        bc.q(parcel, 12, 4);
        parcel.writeInt(i10);
        bc.p(parcel, 13, this.x);
        bc.k(parcel, 14, this.y, i7);
        bc.p(parcel, 15, this.E);
        bc.l(parcel, 16, this.F);
        bc.l(parcel, 17, this.G);
        bc.p(parcel, 18, this.H);
        boolean z10 = this.I;
        bc.q(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.p(parcel, 20, this.J);
        bc.p(parcel, 21, this.K);
        bc.p(parcel, 22, this.L);
        bc.k(parcel, 23, this.M, i7);
        bc.s(parcel, r10);
    }
}
