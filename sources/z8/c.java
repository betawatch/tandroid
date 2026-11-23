package z8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import y8.v;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new v(11);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.a);
        cc.k(parcel, 3, this.b, i7);
        cc.k(parcel, 5, this.c, i7);
        cc.s(parcel, r10);
    }
}
