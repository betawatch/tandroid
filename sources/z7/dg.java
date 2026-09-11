package z7;

import android.os.Parcel;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class dg extends a9.a {
    public final ig W0(x6.b bVar, ag agVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        agVar.writeToParcel(obtain, 0);
        Parcel Q0 = Q0(obtain, 3);
        ig createFromParcel = Q0.readInt() == 0 ? null : ig.CREATOR.createFromParcel(Q0);
        Q0.recycle();
        return createFromParcel;
    }
}
