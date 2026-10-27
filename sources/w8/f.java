package w8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new s(10);
    public String E;
    public String F;
    public ArrayList G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public x8.c L;
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
    public x8.f x;
    public ArrayList y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.l(parcel, 3, this.b);
        df.l(parcel, 4, this.c);
        df.l(parcel, 5, this.d);
        df.l(parcel, 6, this.e);
        df.l(parcel, 7, this.f);
        df.l(parcel, 8, this.h);
        df.l(parcel, 9, this.n);
        df.l(parcel, 10, this.r);
        df.l(parcel, 11, this.s);
        int i11 = this.v;
        df.s(parcel, 12, 4);
        parcel.writeInt(i11);
        df.p(parcel, 13, this.w);
        df.k(parcel, 14, this.x, i10);
        df.p(parcel, 15, this.y);
        df.l(parcel, 16, this.E);
        df.l(parcel, 17, this.F);
        df.p(parcel, 18, this.G);
        boolean z10 = this.H;
        df.s(parcel, 19, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.p(parcel, 20, this.I);
        df.p(parcel, 21, this.J);
        df.p(parcel, 22, this.K);
        df.k(parcel, 23, this.L, i10);
        df.r(parcel, q5);
    }
}
