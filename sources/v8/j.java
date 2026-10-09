package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.j(29);
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
        int q6 = d0.q(parcel, 20293);
        boolean z10 = this.a;
        d0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.b;
        d0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        d0.k(parcel, 3, this.c, i10);
        boolean z12 = this.d;
        d0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        d0.k(parcel, 5, this.e, i10);
        d0.h(parcel, 6, this.f);
        d0.k(parcel, 7, this.h, i10);
        d0.k(parcel, 8, this.n, i10);
        boolean z13 = this.r;
        d0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        d0.l(parcel, 10, this.s);
        d0.b(parcel, 11, this.v);
        d0.r(parcel, q6);
    }
}
