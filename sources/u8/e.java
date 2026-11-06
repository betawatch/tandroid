package u8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new o(6);
    public String D;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public String n;
    public String r;
    public String s;
    public String w;
    public String x;
    public String y;

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
        xb.l(parcel, 11, this.s);
        xb.l(parcel, 12, this.w);
        xb.l(parcel, 13, this.x);
        xb.l(parcel, 14, this.y);
        xb.l(parcel, 15, this.D);
        xb.s(parcel, r10);
    }
}
