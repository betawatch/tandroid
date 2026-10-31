package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR = new s(3);
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.l(parcel, 3, this.b);
        h0.l(parcel, 4, this.c);
        h0.l(parcel, 5, this.d);
        h0.l(parcel, 6, this.e);
        h0.l(parcel, 7, this.f);
        h0.l(parcel, 8, this.h);
        h0.l(parcel, 9, this.n);
        h0.l(parcel, 10, this.r);
        boolean z10 = this.s;
        h0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.l(parcel, 12, this.w);
        h0.r(parcel, q6);
    }
}
