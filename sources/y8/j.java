package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        int r10 = bc.r(parcel, 20293);
        boolean z10 = this.a;
        bc.q(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.b;
        bc.q(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        bc.k(parcel, 3, this.c, i7);
        boolean z12 = this.d;
        bc.q(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        bc.k(parcel, 5, this.e, i7);
        bc.h(parcel, 6, this.f);
        bc.k(parcel, 7, this.h, i7);
        bc.k(parcel, 8, this.n, i7);
        boolean z13 = this.r;
        bc.q(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        bc.l(parcel, 10, this.s);
        bc.b(parcel, 11, this.w);
        bc.s(parcel, r10);
    }
}
