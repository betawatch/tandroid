package x8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new w8.b(18);
    public ArrayList E;
    public String F;
    public String G;
    public ArrayList H;
    public boolean I;
    public ArrayList J;
    public ArrayList K;
    public ArrayList L;
    public y8.c M;
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
    public y8.f y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.m(parcel, 3, this.b);
        j8.a.m(parcel, 4, this.c);
        j8.a.m(parcel, 5, this.d);
        j8.a.m(parcel, 6, this.e);
        j8.a.m(parcel, 7, this.f);
        j8.a.m(parcel, 8, this.h);
        j8.a.m(parcel, 9, this.n);
        j8.a.m(parcel, 10, this.r);
        j8.a.m(parcel, 11, this.s);
        int i10 = this.w;
        j8.a.r(parcel, 12, 4);
        parcel.writeInt(i10);
        j8.a.q(parcel, 13, this.x);
        j8.a.l(parcel, 14, this.y, i3);
        j8.a.q(parcel, 15, this.E);
        j8.a.m(parcel, 16, this.F);
        j8.a.m(parcel, 17, this.G);
        j8.a.q(parcel, 18, this.H);
        boolean z10 = this.I;
        j8.a.r(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j8.a.q(parcel, 20, this.J);
        j8.a.q(parcel, 21, this.K);
        j8.a.q(parcel, 22, this.L);
        j8.a.l(parcel, 23, this.M, i3);
        j8.a.t(parcel, s6);
    }
}
