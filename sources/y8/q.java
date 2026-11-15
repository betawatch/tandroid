package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.l(parcel, 3, this.b);
        yb.l(parcel, 4, this.c);
        yb.l(parcel, 5, this.d);
        yb.l(parcel, 6, this.e);
        yb.l(parcel, 7, this.f);
        yb.l(parcel, 8, this.h);
        yb.l(parcel, 9, this.n);
        yb.l(parcel, 10, this.r);
        boolean z10 = this.s;
        yb.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.l(parcel, 12, this.w);
        yb.s(parcel, r10);
    }
}
