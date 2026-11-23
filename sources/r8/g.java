package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import q4.x;
import q6.w;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new x(14);
    public final int a;
    public final w b;

    public g(int i7, w wVar) {
        this.a = i7;
        this.b = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        cc.k(parcel, 2, this.b, i7);
        cc.s(parcel, r10);
    }
}
