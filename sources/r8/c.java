package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new p7.n(10);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public b f;
    public b h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.l(parcel, 3, this.b);
        h0.l(parcel, 4, this.c);
        h0.l(parcel, 5, this.d);
        h0.l(parcel, 6, this.e);
        h0.k(parcel, 7, this.f, i10);
        h0.k(parcel, 8, this.h, i10);
        h0.r(parcel, q6);
    }
}
