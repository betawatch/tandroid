package w8;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class j extends p6.a {
    public static final Parcelable.Creator<j> CREATOR = new q7.m(27);
    public boolean a;
    public boolean b;
    public c c;
    public boolean d;
    public m e;
    public ArrayList f;
    public l h;
    public n n;
    public boolean r;
    public String s;
    public Bundle v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        boolean z10 = this.a;
        df.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.b;
        df.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        df.k(parcel, 3, this.c, i10);
        boolean z12 = this.d;
        df.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        df.k(parcel, 5, this.e, i10);
        df.h(parcel, 6, this.f);
        df.k(parcel, 7, this.h, i10);
        df.k(parcel, 8, this.n, i10);
        boolean z13 = this.r;
        df.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        df.l(parcel, 10, this.s);
        df.b(parcel, 11, this.v);
        df.r(parcel, q5);
    }
}
