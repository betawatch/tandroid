package s8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new q7.m(14);
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
        df.l(parcel, 12, this.v);
        df.l(parcel, 13, this.w);
        df.l(parcel, 14, this.x);
        df.l(parcel, 15, this.y);
        df.r(parcel, q5);
    }
}
