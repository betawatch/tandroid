package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new u8.o(27);
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.l(parcel, 3, this.b);
        xb.l(parcel, 4, this.c);
        xb.l(parcel, 5, this.d);
        xb.l(parcel, 6, this.e);
        xb.l(parcel, 7, this.f);
        xb.l(parcel, 8, this.h);
        xb.l(parcel, 9, this.n);
        xb.l(parcel, 10, this.r);
        boolean z9 = this.s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.l(parcel, 12, this.w);
        xb.s(parcel, r10);
    }
}
