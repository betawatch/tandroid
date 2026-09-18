package z7;

import android.os.Parcel;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
