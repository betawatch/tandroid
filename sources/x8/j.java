package x8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends q6.a {
    public static final Parcelable.Creator<j> CREATOR = new w8.b(5);
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
    public Bundle w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        boolean z10 = this.a;
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.b;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        j8.a.l(parcel, 3, this.c, i3);
        boolean z12 = this.d;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        j8.a.l(parcel, 5, this.e, i3);
        j8.a.i(parcel, 6, this.f);
        j8.a.l(parcel, 7, this.h, i3);
        j8.a.l(parcel, 8, this.n, i3);
        boolean z13 = this.r;
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        j8.a.m(parcel, 10, this.s);
        j8.a.c(parcel, 11, this.w);
        j8.a.t(parcel, s6);
    }
}
