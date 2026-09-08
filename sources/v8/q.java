package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new r(6);
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
    public String v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.a);
        e0.l(parcel, 3, this.b);
        e0.l(parcel, 4, this.c);
        e0.l(parcel, 5, this.d);
        e0.l(parcel, 6, this.e);
        e0.l(parcel, 7, this.f);
        e0.l(parcel, 8, this.h);
        e0.l(parcel, 9, this.n);
        e0.l(parcel, 10, this.r);
        boolean z10 = this.s;
        e0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        e0.l(parcel, 12, this.v);
        e0.r(parcel, q6);
    }
}
