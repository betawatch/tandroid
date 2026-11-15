package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import y8.v;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new v(11);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.k(parcel, 3, this.b, i7);
        yb.k(parcel, 5, this.c, i7);
        yb.s(parcel, r10);
    }
}
