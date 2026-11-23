package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import q4.x;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new x(15);
    public final int a;
    public final n6.a b;
    public final q6.x c;

    public h(int i7, n6.a aVar, q6.x xVar) {
        this.a = i7;
        this.b = aVar;
        this.c = xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        cc.k(parcel, 2, this.b, i7);
        cc.k(parcel, 3, this.c, i7);
        cc.s(parcel, r10);
    }
}
