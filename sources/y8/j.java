package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        int r10 = yb.r(parcel, 20293);
        boolean z10 = this.a;
        yb.q(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.b;
        yb.q(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        yb.k(parcel, 3, this.c, i7);
        boolean z12 = this.d;
        yb.q(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        yb.k(parcel, 5, this.e, i7);
        yb.h(parcel, 6, this.f);
        yb.k(parcel, 7, this.h, i7);
        yb.k(parcel, 8, this.n, i7);
        boolean z13 = this.r;
        yb.q(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        yb.l(parcel, 10, this.s);
        yb.b(parcel, 11, this.w);
        yb.s(parcel, r10);
    }
}
