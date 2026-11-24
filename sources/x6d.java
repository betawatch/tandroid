// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x6d extends b4 {
    public static final Parcelable.Creator<x6d> CREATOR = new lbd(15);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public String r;
    public boolean s;
    public String w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.c);
        mve.l(parcel, 5, this.d);
        mve.l(parcel, 6, this.e);
        mve.l(parcel, 7, this.f);
        mve.l(parcel, 8, this.h);
        mve.l(parcel, 9, this.n);
        mve.l(parcel, 10, this.r);
        boolean z = this.s;
        mve.q(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.l(parcel, 12, this.w);
        mve.s(parcel, r);
    }
}
