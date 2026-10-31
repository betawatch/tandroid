package v8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j extends o6.a {
    public static final Parcelable.Creator<j> CREATOR = new p7.n(26);
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        boolean z10 = this.a;
        h0.s(parcel, 1, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.b;
        h0.s(parcel, 2, 4);
        parcel.writeInt(z11 ? 1 : 0);
        h0.k(parcel, 3, this.c, i10);
        boolean z12 = this.d;
        h0.s(parcel, 4, 4);
        parcel.writeInt(z12 ? 1 : 0);
        h0.k(parcel, 5, this.e, i10);
        h0.h(parcel, 6, this.f);
        h0.k(parcel, 7, this.h, i10);
        h0.k(parcel, 8, this.n, i10);
        boolean z13 = this.r;
        h0.s(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        h0.l(parcel, 10, this.s);
        h0.b(parcel, 11, this.w);
        h0.r(parcel, q6);
    }
}
