package z7;

import android.os.Parcel;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
