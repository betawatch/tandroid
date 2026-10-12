package z7;

import android.os.Parcel;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class dg extends a9.a {
    public final ig V0(x6.b bVar, ag agVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        agVar.writeToParcel(obtain, 0);
        Parcel P0 = P0(obtain, 3);
        ig createFromParcel = P0.readInt() == 0 ? null : ig.CREATOR.createFromParcel(P0);
        P0.recycle();
        return createFromParcel;
    }
}
