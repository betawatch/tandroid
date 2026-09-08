package w8;

import android.os.Parcel;
import android.os.Parcelable;
import v8.r;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new r(20);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.a);
        e0.k(parcel, 3, this.b, i10);
        e0.k(parcel, 5, this.c, i10);
        e0.r(parcel, q6);
    }
}
