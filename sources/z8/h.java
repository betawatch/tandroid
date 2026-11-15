package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import y8.v;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new v(15);
    public String a;
    public String b;
    public f c;
    public g d;
    public g e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.l(parcel, 3, this.b);
        yb.k(parcel, 4, this.c, i7);
        yb.k(parcel, 5, this.d, i7);
        yb.k(parcel, 6, this.e, i7);
        yb.s(parcel, r10);
    }
}
