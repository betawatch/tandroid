package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new u8.o(20);
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        boolean z10 = this.a;
        cc.q(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.b;
        cc.q(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        cc.k(parcel, 3, this.c, i7);
        boolean z12 = this.d;
        cc.q(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        cc.k(parcel, 5, this.e, i7);
        cc.h(parcel, 6, this.f);
        cc.k(parcel, 7, this.h, i7);
        cc.k(parcel, 8, this.n, i7);
        boolean z13 = this.r;
        cc.q(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        cc.l(parcel, 10, this.s);
        cc.b(parcel, 11, this.w);
        cc.s(parcel, r10);
    }
}
